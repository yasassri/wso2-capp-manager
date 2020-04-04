package org.wso2.capp.client.executers;

import javax.activation.DataHandler;
import java.io.File;
import java.net.URL;

import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.transport.http.HTTPConstants;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.carbon.application.mgt.stub.upload.types.carbon.UploadedFileItem;
import org.wso2.carbon.stub.ApplicationAdminStub;
import org.wso2.carbon.stub.AuthenticationAdminStub;
import org.wso2.carbon.stub.CarbonAppUploaderStub;

public class ClientExecutor {

    private String serverUrl;
    private String userName;
    private String password;

    private final String CAR_EXTENSION = ".car";

    private static final Logger log = LogManager.getLogger(ClientExecutor.class);

    public ClientExecutor(String serverUrl, String userName, String password) {
        this.serverUrl = serverUrl;
        this.userName = userName;
        this.password = password;
    }

    /**
     * Methos to upload a given Capp to a remote server
     *
     * @param carFile
     * @throws Exception
     */
    public void deployCApp(File carFile) throws Exception {

        CarbonAppUploaderStub carbonAppUploaderStub = getCarbonAppUploaderStub(userName, password, serverUrl);
        UploadedFileItem uploadedFileItem = new UploadedFileItem();
        DataHandler param = new DataHandler(carFile.toURI().toURL());
        uploadedFileItem.setDataHandler(param);
        uploadedFileItem.setFileName(carFile.getName());
        uploadedFileItem.setFileType("jar");
        UploadedFileItem[] fileItems = new UploadedFileItem[]{uploadedFileItem};
        log.info("Uploading " + carFile.getName() + " to " + serverUrl + "...");
        carbonAppUploaderStub.uploadApp(fileItems);
    }

    /**
     * Undeploys a given CApp.
     * @param cAppName Application Name
     * @throws Exception
     */
    public void unDeployCAR(String cAppName) throws Exception {

        ApplicationAdminStub appAdminStub = getApplicationAdminStub(serverUrl, userName, password);
        log.info("Undeploying Capp " + cAppName + " from the server " + serverUrl);
        appAdminStub.deleteApplication(cAppName);
    }

    /**
     * Returns a @{List} of existing CApps deployed.
     * @return
     * @throws Exception
     */
    public String[] getExistingApplicationList() throws Exception {
        ApplicationAdminStub appAdminStub = getApplicationAdminStub(serverUrl, userName, password);
        String[] existingApplications = appAdminStub.listAllApplications();
        return existingApplications;
    }

    /**
     * Downloads a diven CApp and copies to a provided destination.
     * @param cAppName Name of the Capp
     * @param downloadLocation Destination where the downloaded CApp should be copied
     * @throws Exception thrown by the stub
     */
    public void downLoadCAR(String cAppName, String downloadLocation) throws Exception {

        ApplicationAdminStub appAdminStub = getApplicationAdminStub(serverUrl, userName, password);
        log.info("Downloading Capp " + cAppName  + " from the server " + serverUrl);
        DataHandler dataHandler = appAdminStub.downloadCappArchive(cAppName);
        File targetFile = new File(downloadLocation + File.separator + cAppName + CAR_EXTENSION);
        FileUtils.copyInputStreamToFile(dataHandler.getInputStream(), targetFile);
    }


    private String createSessionCookie(String serverURL, String username, String pwd) throws Exception {
        AuthenticationAdminStub authenticationStub;
        URL url = new URL(serverURL);
        authenticationStub = new AuthenticationAdminStub(serverURL + "/services/AuthenticationAdmin");
        authenticationStub._getServiceClient().getOptions().setManageSession(true);
        if (authenticationStub.login(username, pwd, "127.0.0.1")) {
            ServiceContext serviceContext = authenticationStub._getServiceClient().getLastOperationContext().getServiceContext();
            String sessionCookie = (String) serviceContext.getProperty(HTTPConstants.COOKIE_STRING);
            return sessionCookie;
        } else {
            log.error("Error occurred while login to the remote server!");
            return null;
        }
    }

    private CarbonAppUploaderStub getCarbonAppUploaderStub(String username,
                                                           String pwd, String url) throws Exception {
        String sessionCookie = createSessionCookie(url, username, pwd);
        CarbonAppUploaderStub carbonAppUploaderStub = new CarbonAppUploaderStub(url + "/services/CarbonAppUploader");
        carbonAppUploaderStub._getServiceClient().getOptions().setManageSession(true);
        carbonAppUploaderStub._getServiceClient().getOptions().setProperty(HTTPConstants.COOKIE_STRING, sessionCookie);
        return carbonAppUploaderStub;
    }

    private ApplicationAdminStub getApplicationAdminStub(String serverURL, String username, String pwd) throws Exception {
        String sessionCookie = createSessionCookie(serverURL, username, pwd);
        ApplicationAdminStub appAdminStub = new ApplicationAdminStub(serverURL + "/services/ApplicationAdmin");
        appAdminStub._getServiceClient().getOptions().setManageSession(true);
        appAdminStub._getServiceClient().getOptions().setProperty(HTTPConstants.COOKIE_STRING, sessionCookie);
        return appAdminStub;
    }
}
