package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.executers.ClientExecutor;
import org.wso2.capp.client.util.Utils;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "list-apps", description = "Lists already deployed carbon applications")
public class ListAppsCommand implements Runnable {
    public ListAppsCommand() {
    }

    private static final Logger log = LogManager.getLogger(ListAppsCommand.class);

    @Option(names = {"-s", "--server"}, description = "EI server url", required = true)
    private String serverUrl = "";

    @Option(names = {"-u", "--username"}, description = "Username of the user to access the server", required = true)
    private String userName = "";

    @Option(names = {"-p", "--password"}, description = "The password of the server user", required = true)
    private String password = "";

    @Option(names = {"-tl", "--trustore-location"}, description = "The truststore location")
    private String trustoreLocation = "";

    @Option(names = {"-tp", "--trustore-password"}, description = "The truststore password")
    private String trustorePassword = "wso2carbon";

    @Option(names = {"-k", "--insecure"}, description = "Disable Hostname Verification")
    private boolean insecure = false;

    @Override
    public void run() {

        Utils.setUpKeystore(trustoreLocation, trustorePassword, insecure);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            String[] appList = client.getExistingApplicationList();
            if (appList != null) {
                for (String app : appList) {
                    log.info("Capp was found with the name " + app);
                    System.out.println(app);
                }
                return;
            }
            log.warn("Unable to find any deployed CApps");
        } catch (Exception e) {
            Utils.handleError(e);
        }
    }
}
