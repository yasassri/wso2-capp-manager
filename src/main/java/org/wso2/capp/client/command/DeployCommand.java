package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.exception.ClientExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;
import org.wso2.capp.client.util.Utils;
import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(name = "deploy", description = "Deploys a carbon application")
public class DeployCommand implements Runnable {

    public DeployCommand() {
    }

    private static final Logger log = LogManager.getLogger(DeployCommand.class);
    private static final String CAR_EXTENSION = ".car";

    @CommandLine.Option(names = {"-s", "--server"}, description = "EI server url", required = true)
    private String serverUrl = "";

    @CommandLine.Option(names = {"-u", "--username"}, description = "Username of the user to access the server", required = true)
    private String userName = "";

    @CommandLine.Option(names = {"-p", "--password"}, description = "The password of the server user", required = true)
    private String password = "";

    @CommandLine.Option(names = {"-tl", "--trustore-location"}, description = "The truststore location")
    private String trustoreLocation = "";

    @CommandLine.Option(names = {"-tp", "--trustore-password"}, description = "The truststore password")
    private String trustorePassword = "wso2carbon";

    @CommandLine.Option(names = {"-k", "--insecure"}, description = "Disable Hostname Verification")
    private boolean insecure = false;

    @CommandLine.Option(names = {"-fo", "--force"}, description = "Force the deployment, undeploy any existing version and deploy new version")
    private boolean forceDeploy = false;

    @CommandLine.Option(names = {"-f", "--file"}, description = "Provide the path to capp file.", required = true)
    private String carFileLocation = "";

    @Override
    public void run() {
        Utils.setUpKeystore(trustoreLocation, trustorePassword, insecure);
        try {
            File carFile = new File(carFileLocation);
            if (!carFile.isFile() && !carFile.getName().endsWith(CAR_EXTENSION)) {
                throw new ClientExecutionException("The provided file is not not found or the extension is wrong " + carFile.getAbsolutePath());
            }

            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);

            String[] appList = client.getExistingApplicationList();

            // Check whether existing capps exists
            if (appList != null) {
                for (String app : appList) {
                    if (app.startsWith(carFile.getName().split("_")[0])) {
                        if (forceDeploy) {
                            log.info("The force deploy flag is specified hence undeploying the CApp ", carFile.getName());
                            client.unDeployCAR(app);
                            Thread.sleep(5000);
                        } else {
                            throw new ClientExecutionException("A app already exists with the name " + carFile.getName());
                        }
                    }
                }
            }
            client.deployCApp(carFile);
        } catch (Exception e) {
            Utils.handleError(e);
        }
    }
}
