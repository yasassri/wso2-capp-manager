package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.Option;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;
import org.wso2.capp.client.util.Utils;

import java.net.URL;


public class ListAppsCommand implements Command {
    private static final Logger log = LogManager.getLogger(ListAppsCommand.class);

    @Option(name = "--server",
            usage = "Specify the server url",
            aliases = {"--server", "-S"},
            required = true)
    private String serverUrl = "";

    @Option(name = "--username",
            usage = "Specify the username",
            aliases = {"-U"},
            required = true)
    private String userName = "";

    @Option(name = "--password",
            usage = "Specify the password",
            aliases = {"-P"},
            required = true)
    private String password = "";

    @Option(name = "--trustore-location",
            usage = "Specify the truststore location",
            aliases = {"-T"},
            depends={"--trustore-password"})
    private String trustoreLocation = "";

    @Option(name = "--trustore-password",
            usage = "Specify the truststore password",
            aliases = {"-TP"})
    private String trustorePassword = "wso2carbon";

    @Option(name = "--insecure",
            usage = "Disable Hostname Verification",
            aliases = {"-K"})
    private boolean insecure = false;

    public ListAppsCommand() {
    }

    @Override
    public void execute() throws CommandExecutionException {

        Utils.setUpKeystore (trustoreLocation, trustorePassword, insecure);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            String[] appList = client.getExistingApplicationList();
            if(appList != null) {
                for (String app : appList) {
                    log.info("Capp was found with the name " + app);
                    System.out.println(app);
                }
                return;
            }
            log.warn("Unable to find any deployed CApps");
        } catch (Exception e) {
            throw new CommandExecutionException("Error while executing List command", e);
        }
    }
}
