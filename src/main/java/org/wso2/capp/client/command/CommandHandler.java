package org.wso2.capp.client.command;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.SubCommand;
import org.kohsuke.args4j.spi.SubCommandHandler;
import org.kohsuke.args4j.spi.SubCommands;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.exception.CommandExecutionException;

/**
 * This is the entry point that handles all the sub-commands
 * <p>
 * This extends from the help command since help is not a sub-command but an argument.
 * So, help command is special cased.
 */
public class CommandHandler extends HelpCommand {

    private static final Logger log = LogManager.getLogger(CommandHandler.class);

    @Argument(
            metaVar = "<sub-command>",
            usage = "Consists of several sub-commands",
            handler = SubCommandHandler.class
    )
    @SubCommands({
            @SubCommand(name = "deploy",
                    impl = DeployCommand.class),
            @SubCommand(name = "undeploy",
                    impl = UndeployCommand.class),
            @SubCommand(name = "list-apps",
                    impl = ListAppsCommand.class),
            @SubCommand(name = "help",
                    impl = HelpCommand.class),
            @SubCommand(name = "help",
                    impl = HelpCommand.class)
    })
    private Command cmd = new HelpCommand();
    @Option(name = "-help",
            usage = "Show help",
            hidden = true,
            aliases = {"--help", "-h"})
    private boolean help = false;

    @Override
    public void execute() throws CommandExecutionException {
        log.info("Processing the input command.....");
        if (help) {
            super.execute();
            return;
        }
        cmd.execute();
    }
}