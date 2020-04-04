package org.wso2.capp.client;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.wso2.capp.client.command.CommandHandler;
import org.wso2.capp.client.exception.CommandExecutionException;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String args []) throws Exception {
        System.setProperty("APP_LOG_ROOT","logs");
        // To get rid of logger warnings thrown by axis2 components
        BasicConfigurator.configure();
        org.apache.log4j.Logger.getRootLogger().setLevel(Level.ERROR);
        try {
            // Parse command line arguments
            CommandHandler commandHandler = new CommandHandler();
            CmdLineParser parser = new CmdLineParser(commandHandler);
            parser.parseArgument(args);
            commandHandler.execute();

        } catch (CmdLineException e) {
            logger.error("Error while parsing command line arguments.", e);
            System.exit(1);
        } catch (CommandExecutionException e) {
            logger.error("Error while executing command.", e);
            System.exit(1);
        } catch (Throwable e) {
            logger.error("An Error occurred while executing the CLI tool ", e);
            System.exit(1);
        }
    }

    private static void setSystemProperties(String trustStorePath, String trustStorePassword){
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
    }
}
