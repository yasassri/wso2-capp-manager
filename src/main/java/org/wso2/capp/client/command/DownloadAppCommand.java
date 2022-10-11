package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;
import org.wso2.capp.client.util.Utils;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "download", description = "Downloads a carbon application")
public class DownloadAppCommand implements Runnable {
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

    @CommandLine.Option(names = {"-an", "--app-name"}, description = "Specify the name of the app", required = true)
    private String cAppName = "";

    @CommandLine.Option(names = {"-d", "--destination"}, description = "Specify the truststore password", required = true)
    private String destination = "";

    @Override
    public void run() {
        Utils.setUpKeystore(trustoreLocation, trustorePassword, insecure);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            String[] appList = client.getExistingApplicationList();
            if (appList != null) {
                for (String app : appList) {
                    // The CApp name also can have _ characters so we need to only get the correct fraction as the name
                    int i = app.lastIndexOf("_");
                    String appName = app.substring(0, i);
                    if (appName.equals(cAppName)) {
                        log.info("The CApp " + app + " will be downloaded to " + destination);
                        client.downLoadCAR(app, destination);
                        return;
                    }
                }
                throw new CommandExecutionException("No Carbon application was found with the name " + cAppName);
            }
        } catch (Exception e) {
            Utils.handleError(e);
        }
    }
}
