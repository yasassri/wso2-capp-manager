package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.Option;
import org.wso2.capp.client.exception.ClientExecutionException;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;

import java.io.File;

public class DeployCommand implements Command {
    private static final Logger log = LogManager.getLogger(DeployCommand.class);

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

    @Option(name = "--force",
            usage = "Force the deployment, undeploy any existing version and deploy new version",
            aliases = {"-fo"})
    private boolean forceDeploy = false;

    @Option(name = "--file",
            usage = "Provide the path to configuration file.",
            aliases = {"-F"},
            required = true)
    private String carFileLocation = "";

    public DeployCommand() {
    }

    @Override
    public void execute() throws CommandExecutionException {
        setSystemProperties(trustoreLocation, trustorePassword);
        try {
            File carFile = new File(carFileLocation);
            if (!carFile.isFile() && !carFile.getName().endsWith(CAR_EXTENSION)) {
                throw new Exception("The provided file is not not found or the extension is wrong " + carFile.getAbsolutePath());
            }

            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);

            if (forceDeploy) {
                // Check whether existing capp exists
                if (client.getExistingApplicationList() != null) {
                    for (String app : client.getExistingApplicationList()) {
                        if (app.startsWith(carFile.getName().split("_")[0])) {
                            client.unDeployCAR(app);
                            Thread.sleep(5000);
                        }
                    }
                }
            } else {
                if (client.getExistingApplicationList() != null) {
                    for (String app : client.getExistingApplicationList()) {
                        if (app.startsWith(carFile.getName().split("_")[0])) {
                            throw new ClientExecutionException("A app already exists with the name " + carFile.getName());
                        }
                    }
                }
            }
            client.deployCApp(carFileLocation);
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
