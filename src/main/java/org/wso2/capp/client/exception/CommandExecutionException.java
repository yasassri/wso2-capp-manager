package org.wso2.capp.client.exception;

/**
 * This is a custom exception class to throw all issues related to command execution. This will also be visible
 * to external callers.
 *
 * @since 1.0.0
 */
public class CommandExecutionException extends Exception {

    private static final long serialVersionUID = -3737172758165430862L;

    /**
     * Constructs a new exception with {@code null} as its detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link #initCause(Throwable)}.
     */
    public CommandExecutionException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message. The cause is not initialized, and may
     * subsequently be initialized by a call to {@link #initCause}.
     *
     * @param message the detail message of the exception
     */
    public CommandExecutionException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified cause and a detail message of {@code (cause==null ? null :
     * cause.toString())} which typically contains the class and detail message of the {@code cause}.
     *
     * @param cause the cause of the exception
     */
    public CommandExecutionException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     *
     * @param message the detail message of the exception
     * @param cause   the cause of the exception
     */
    public CommandExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}