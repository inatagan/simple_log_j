package io.github.inatagan.simple_log_j;

import java.nio.file.Files;

public class SimpleLogJ implements SimpleLogJInterface {

    /**
     * Default constructor for SimpleLogJ.
     */
    public SimpleLogJ() {
        // No initialization required
    }

    private static void createIfNotExistsFile() {
        // This method is intended to create a log file if it does not exist.
        try {
            // Example: Create a log file in the current directory
            java.io.File logFile = new java.io.File("application.log");
            if (!logFile.exists()) {
                logFile.createNewFile();
                System.out.println("Log file created: " + logFile.getAbsolutePath());
            } else {
                System.out.println("Log file already exists: " + logFile.getAbsolutePath());
            }
        } catch (Exception e) {
            System.err.println("Failed to create log file: " + e.getMessage());
        }
    }

    @Override
    public void info(String message) {
        try {
            String recordTime = java.time.LocalDateTime.now().toString();
            createIfNotExistsFile();
            Files.writeString(
                    java.nio.file.Paths.get("application.log"),
                    "[INFO]: " + recordTime + " --> " + message + System.lineSeparator(),
                    java.nio.file.StandardOpenOption.APPEND,
                    java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }

    @Override
    public void error(String message) {
        try {
            String recordTime = java.time.LocalDateTime.now().toString();
            createIfNotExistsFile();
            Files.writeString(
                    java.nio.file.Paths.get("application.log"),
                    "[ERROR]: " + recordTime + " --> " + message + System.lineSeparator(),
                    java.nio.file.StandardOpenOption.APPEND,
                    java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }

    @Override
    public void debug(String message) {
        try {
            String recordTime = java.time.LocalDateTime.now().toString();
            createIfNotExistsFile();
            Files.writeString(
                    java.nio.file.Paths.get("application.log"),
                    "[DEBUG]: " + recordTime + " --> " + message + System.lineSeparator(),
                    java.nio.file.StandardOpenOption.APPEND,
                    java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }

    @Override
    public void warning(String message) {
        try {
            String recordTime = java.time.LocalDateTime.now().toString();
            createIfNotExistsFile();
            Files.writeString(
                    java.nio.file.Paths.get("application.log"),
                    "[WARNING]: " + recordTime + " --> " + message + System.lineSeparator(),
                    java.nio.file.StandardOpenOption.APPEND,
                    java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }

    @Override
    public void success(String message) {
        try {
            String recordTime = java.time.LocalDateTime.now().toString();
            createIfNotExistsFile();
            Files.writeString(
                    java.nio.file.Paths.get("application.log"),
                    "[SUCCESS]: " + recordTime + " --> " + message + System.lineSeparator(),
                    java.nio.file.StandardOpenOption.APPEND,
                    java.nio.file.StandardOpenOption.CREATE);
        } catch (java.io.IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }

}
