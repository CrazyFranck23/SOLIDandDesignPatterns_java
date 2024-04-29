package fr.esiea.tools.static_logger;

import java.time.LocalDateTime;

public class LoggerTimer implements Timer {
    @Override
    public LocalDateTime getCurrentTime() {
        // Retourne l'heure et la date actuelles.
        return LocalDateTime.now();
    }
}
