package org.wso2.capp.client.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.wso2.capp.client.exception.CommandExecutionException;
import org.wso2.capp.client.util.StringUtil;

/**
 * This class lists the available functions.
 *
 * @since 1.0.0
 */
public class HelpCommand implements Command {

    private static final Logger logger = LogManager.getLogger(HelpCommand.class);

    @Override
    public void execute() throws CommandExecutionException {
        String ls = System.lineSeparator();
        String usageBuilder = StringUtil.concatStrings(ls, "Help is on the way!!!!!!!!");
        logger.info(usageBuilder);
    }

    /**
     * fixing args4j issue of showing the class id in the help output.
     */
    @Override
    public String toString() {
        return "";
    }
}
