package fr.esiea.tools.singleton;

import java.time.LocalDateTime;

public class SingletonConsoleLogger implements ILogger {
    private static Timer timer;
    private static SingletonConsoleLogger logger = null;

    private SingletonConsoleLogger() {} // Le constructeur privé empêche l'instanciation directe depuis l'extérieur de la classe

    public static synchronized SingletonConsoleLogger getInstance() {
        if (logger == null)
            logger = new SingletonConsoleLogger();
        return logger;
    }

    public static void setTimer(Timer new_timer) {
        timer = new_timer;
    }

    public void write(Level level, String message) {
        writeToTerminal(level, message);
    }

    private static void writeToTerminal(Level level, String message) {
        LocalDateTime currentTime = timer.getCurrentTime();
        System.out.println("[" + currentTime + "]" + " - " + level + " - " + message);
    }
}
