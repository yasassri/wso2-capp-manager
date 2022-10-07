package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.Option;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;

public class DownloadAppCommand implements Command {
    private static final Logger log = LogManager.getLogger(DeployCommand.class);

    private static final String CAR_EXTENSION = ".car";

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
    private String trustorePassword = "";

    @Option(name = "--app-name",
            usage = "Specify the Capp Name",
            aliases = {"-N"})
    private String cAppName = "";

    @Option(name = "--destination",
            usage = "Provide the directory to save the CApp.",
            aliases = {"-D"},
            required = true)
    private String destination = "";

    @Option(name = "--insecure",
            usage = "Disable Hostname Verification",
            aliases = {"-K"})
    private boolean insecure = false;

    public DownloadAppCommand() {
    }

    @Override
    public void execute() throws CommandExecutionException {
        setSystemProperties(trustoreLocation, trustorePassword, insecure);
        try {
            ClientExecutor client = new ClientExecutor(serverUrl, userName, password);
            String[] appList = client.getExistingApplicationList();
            if (appList != null) {
                    for (String app : appList) {
                        // The CApp name also can have _ characters so we need to only get the correct fraction as the name
                        int i = app.lastIndexOf("_");
                        String appName =  app.substring(0, i);
                        if (appName.equals(cAppName)) {
                            log.info("The CApp " + app + " will be downloaded to " + destination);
                            client.downLoadCAR(app, destination);
                            return;
                        }
                    }
                    throw new CommandExecutionException("No Carbon application was found with the name " + cAppName);
                }
        } catch (Exception e) {
            throw new CommandExecutionException("Error while executing download command", e);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword, boolean insecure) {
        if (insecure) {
            System.setProperty("httpclient.hostnameVerifier", "AllowAll");
        }
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }

}