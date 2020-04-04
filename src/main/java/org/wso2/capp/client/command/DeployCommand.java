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
            usage = "Specify the server url",
            hidden = false,
            aliases = {"--server", "-S"},
            required = true)
    private String serverUrl = "";

    @Option(name = "--username",
            usage = "Specify the username",
            hidden = false,
            aliases = {"-U"},
            required = true)
    private String userName = "";

    @Option(name = "--password",
            usage = "Specify the password",
            hidden = false,
            aliases = {"-P"},
            required = true)
    private String password = "";

    @Option(name = "--trustore-location",
            usage = "Specify the truststore location",
            hidden = false,
            aliases = {"-T"},
            required = true)
    private String trustoreLocation = "";

    @Option(name = "--trustore-password",
            usage = "Specify the truststore password",
            hidden = false,
            aliases = {"-TP"},
            required = true)
    private String trustorePassword = "";

    @Option(name = "--force",
            usage = "Force the deployment, undeploy any existing version and deploy new version",
            aliases = {"-FO"})
    private boolean forceDeploy = false;

    @Option(name = "--file",
            usage = "Provide the path to capp file.",
            aliases = {"-F"},
            required = true)
    private String carFileLocation = "";

    public DeployCommand() {}

    @Override
    public void execute() throws CommandExecutionException {
        setSystemProperties(trustoreLocation, trustorePassword);
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
            throw new CommandExecutionException("Error while executing deploy command", e);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword) {
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }

}
