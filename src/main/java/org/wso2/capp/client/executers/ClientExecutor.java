package org.wso2.capp.client.executers;

import javax.activation.DataHandler;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.transport.http.HTTPConstants;

import org.wso2.capp.client.model.CarbonServer;
import org.wso2.carbon.application.mgt.stub.upload.types.carbon.UploadedFileItem;
import org.wso2.carbon.stub.ApplicationAdminExceptionException;
import org.wso2.carbon.stub.ApplicationAdminStub;
import org.wso2.carbon.stub.AuthenticationAdminStub;
import org.wso2.carbon.stub.CarbonAppUploaderStub;

public class ClientExecutor {

    private String serverUrl;
    private String userName;
    private String password;

    private final String CAR_EXTENSION = ".car";

    public ClientExecutor(String serverUrl, String userName, String password) {
        this.serverUrl = serverUrl;
        this.userName = userName;
        this.password = password;
    }

    public void deployCApp(String carFileLocation) throws Exception {
        File carFile = new File(carFileLocation);

        if (!carFile.isFile() && !carFile.getName().endsWith(CAR_EXTENSION)) {
            throw new Exception("The provided file is not not found or the extension is wrong " + carFile.getAbsolutePath());
        }

        CarbonAppUploaderStub carbonAppUploaderStub = getCarbonAppUploaderStub(userName, password, serverUrl);
        UploadedFileItem uploadedFileItem = new UploadedFileItem();
        DataHandler param = new DataHandler(carFile.toURI().toURL());
        uploadedFileItem.setDataHandler(param);
        uploadedFileItem.setFileName(carFile.getName());
        uploadedFileItem.setFileType("jar");
        UploadedFileItem[] fileItems = new UploadedFileItem[]{uploadedFileItem};
        System.out.println("Uploading " + carFile.getName() + " to " + serverUrl + "...");
        carbonAppUploaderStub.uploadApp(fileItems);
    }

    public void unDeployCAR(String cAppName) throws Exception {
        ApplicationAdminStub appAdminStub = getApplicationAdminStub(serverUrl, userName, password);
        String[] existingApplications = appAdminStub.listAllApplications();


//        if (existingApplications != null && Arrays.asList(existingApplications).contains(project.getArtifactId() + "_" + project.getVersion())) {
//            appAdminStub.deleteApplication(project.getArtifactId() + "_" + project.getVersion());
//            System.out.println("Located the C-App " + project.getArtifactId() + "_" + project.getVersion() + " and undeployed...");
//        }
    }

    public String[] getExistingApplicationList() throws Exception {
        ApplicationAdminStub appAdminStub = getApplicationAdminStub(serverUrl, userName, password);
        String[] existingApplications = appAdminStub.listAllApplications();

        return existingApplications;
    }


    private String createSessionCookie(String serverURL, String username, String pwd) throws Exception {
        AuthenticationAdminStub authenticationStub;
        URL url = new URL(serverURL);
        authenticationStub = new AuthenticationAdminStub(serverURL + "/services/AuthenticationAdmin");
        authenticationStub._getServiceClient().getOptions().setManageSession(true);
        if (authenticationStub.login(username, pwd, url.getHost())) {
            ServiceContext serviceContext = authenticationStub._getServiceClient().getLastOperationContext().getServiceContext();
            String sessionCookie = (String) serviceContext.getProperty(HTTPConstants.COOKIE_STRING);
            System.out.println("Authentication to " + serverURL + " successful.");
            return sessionCookie;
        } else {
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
