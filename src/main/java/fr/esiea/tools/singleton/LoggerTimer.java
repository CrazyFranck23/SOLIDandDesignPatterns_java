package fr.esiea.tools.singleton;

import java.time.LocalDateTime;

public class LoggerTimer implements Timer {
    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
