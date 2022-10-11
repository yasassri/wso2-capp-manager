package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.executers.ClientExecutor;
import org.wso2.capp.client.util.Utils;
import picocli.CommandLine;

@CommandLine.Command(name = "undeploy", description = "Undeploys a given carbon application")
public class UndeployCommand implements Runnable {
    private static final Logger log = LogManager.getLogger(UndeployCommand.class);

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

    @Override
    public void run() {
        Utils.setUpKeystore(trustoreLocation, trustorePassword, insecure);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            String[] appList = client.getExistingApplicationList();
            // Check whether existing capp exists
            if (appList != null) {
                for (String app : appList) {
                    // The CApp name also can have _ characters so we need to only get the correct fraction as the name
                    int i = app.lastIndexOf("_");
                    String appName = app.substring(0, i);
                    if (appName.equals(cAppName)) {
                        client.unDeployCAR(app);
                    }
                }
            }
        } catch (Exception e) {
            Utils.handleError(e);
        }
    }
}
