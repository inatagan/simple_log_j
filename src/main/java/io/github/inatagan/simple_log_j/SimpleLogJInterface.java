package io.github.inatagan.simple_log_j;

public interface SimpleLogJInterface {

    /**
     * Logs a message at the INFO level.
     *
     * @param message the message to log
     */
    void info(String message);

    /**
     * Logs a message at the ERROR level.
     *
     * @param message the message to log
     */
    void error(String message);

    /**
     * Logs a message at the DEBUG level.
     *
     * @param message the message to log
     */
    void debug(String message);

    /**
     * Logs a message at the WARN level.
     * 
     * @param message the message to log
     */
    void warning(String message);

    /**
     * Logs a message at the SUCCESS level.
     *
     * @param message the message to log
     */
    void success(String message);

}
