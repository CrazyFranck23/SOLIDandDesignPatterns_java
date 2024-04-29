package fr.esiea.tools.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class SingletonFileLogger implements ILogger {
    private static Timer timer;
    private static SingletonFileLogger logger = null;

    private static final String LOGS_FILE_PATH = "log.txt";

    private SingletonFileLogger() {} // Constructeur privée

    public static synchronized SingletonFileLogger getInstance() {
        if (logger == null) {
            logger = new SingletonFileLogger();
        }
        return logger;
    }

    public static void setTimer(Timer new_timer) {
        timer = new_timer;
    }

    public void write(Level level, String message) {
        writeToFile(level, message, LOGS_FILE_PATH);
    }

    private static void writeToFile(Level level, String message, String fileName) {
        LocalDateTime currentTime = timer.getCurrentTime();
        String logMessage = "[" + currentTime + "]" + " - " + level + " - " + message;

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(logMessage);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
