package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.Option;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;

import java.io.File;

public class UndeployCommand implements Command {
    private static final Logger log = LogManager.getLogger(UndeployCommand.class);

    private static final String CAR_EXTENSION = ".car";

    @Option(name = "--server",
            usage = "server url flag",
            hidden = false,
            aliases = {"--server", "-S"},
            required = true)
    private String serverUrl = "";

    @Option(name = "--username",
            usage = "username flag",
            hidden = false,
            aliases = {"-U"},
            required = true)
    private String userName = "";

    @Option(name = "--password",
            usage = "password flag",
            hidden = false,
            aliases = {"-P"},
            required = true)
    private String password = "";

    @Option(name = "--trustore-location",
            usage = "truststore location",
            hidden = false,
            aliases = {"-T"},
            required = true)
    private String trustoreLocation = "";

    @Option(name = "--trustore-password",
            usage = "Truststore password",
            hidden = false,
            aliases = {"-TP"},
            required = true)
    private String trustorePassword = "";

    @Option(name = "--app-name",
            usage = "Provide the name of the CApp",
            aliases = {"-A"},
            required = true)
    private String carFileName = "";

    public UndeployCommand() {
    }

    @Override
    public void execute() throws CommandExecutionException {
        setSystemProperties(trustoreLocation, trustorePassword);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            // Check whether existing capp exists
            if (client.getExistingApplicationList() != null) {
                for (String app : client.getExistingApplicationList()) {
                    if (app.startsWith(carFileName)) {
                        client.unDeployCAR(app);
                    }
                }
            }
        } catch (Exception e) {
            throw new CommandExecutionException("Error while executing deploy command", e);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword) {
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }
}
