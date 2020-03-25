package org.wso2.capp.client.command;


import org.wso2.capp.client.exception.CommandExecutionException;

/**
 * To map the commands entered via command-line for the capp client.
 * <p>
 * This is an abstract command class from which all the sub-commands stems.
 * <p>
 * This is based on best practices for args4j command-line argument parser.
 *
 * @since 1.0.0
 */
public interface Command {

    /**
     * Executes the implemented command.
     *
     * @throws CommandExecutionException thrown when error on executing command
     */
    void execute() throws CommandExecutionException;
}
