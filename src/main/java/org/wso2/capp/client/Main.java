package org.wso2.capp.client;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import org.wso2.capp.client.command.ListAppsCommand;
import org.wso2.capp.client.command.DeployCommand;
import org.wso2.capp.client.command.UndeployCommand;
import org.wso2.capp.client.command.DownloadAppCommand;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    @Command(name = "capp-manager", subcommands = {ListAppsCommand.class, DeployCommand.class, UndeployCommand.class, DownloadAppCommand.class})
    static class BaseCommand implements Runnable {
        @Override
        public void run() {
        }
    }

    public static void main(String[] args) {
        // To get rid of logger warnings thrown by axis2 components
        BasicConfigurator.configure();
        org.apache.log4j.Logger.getRootLogger().setLevel(Level.ERROR);
        try {
            CommandLine cmd = new CommandLine(new BaseCommand());
            cmd.setExecutionStrategy(new CommandLine.RunAll());
            if (args.length == 0) {
                cmd.usage(System.out);
            } else {
                cmd.execute(args);
            }
        } catch (Throwable e) {
            logger.error("An Error occurred while executing the CLI tool ", e);
            System.exit(1);
        }
    }
}
