package org.wso2.capp.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.wso2.capp.client.command.CommandHandler;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.executers.ClientExecutor;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String args []) throws Exception {

        System.out.println("Works!!!");
        System.setProperty("APP_LOG_ROOT","logs");
        setSystemProperties("/Users/yasassri/work/services/edinburgh/pack/wso2ei-6.5.0/repository/resources/security/client-truststore.jks", "wso2carbon");

        try {
            // Parse command line arguments
            CommandHandler commandHandler = new CommandHandler();
            CmdLineParser parser = new CmdLineParser(commandHandler);
            parser.parseArgument(args);
            commandHandler.execute();

        } catch (CmdLineException e) {
            logger.error("Error while parsing command line arguments.", e);
        } catch (CommandExecutionException e) {
            logger.error("Error while executing command.", e);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword){
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }
}
