package fr.esiea.tools.static_logger;

import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StaticLogger {
    private static Timer timer; // Un timer pour obtenir l'heure actuelle.
    private static final String LOGS_FILE_PATH = "log.txt"; // Le chemin du fichier de logs.

    // Permet de configurer le Timer utilisé par le logger.
    public static void setTimer(Timer newTimer) {
        timer = newTimer;
    }

    // Écrit un log avec un niveau et un message donnés.
    public static void write(Level level, String message) {
        writeToTerminal(level, message);
        writeToFile(level, message, LOGS_FILE_PATH);
    }

    private static void writeToTerminal(Level level, String message) {
        LocalDateTime currentTime = timer.getCurrentTime();
        System.out.println("[" + currentTime + "]" + " - " + level + " - " + message);
    }

    // Méthode alternative pour écrire dans un fichier spécifique.
    public static void writeToFile(Level level, String message, String fileName) {
        LocalDateTime currentTime = timer.getCurrentTime();
        String logMessage = "[" + currentTime + "]" + " - " + level + " - " + message;

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(logMessage);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
