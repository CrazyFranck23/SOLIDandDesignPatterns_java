package fr.esiea.tools.static_logger;

import java.time.LocalDateTime;

class MockTimer implements Timer {
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.of(2023, 3, 21, 4, 6, 35, 2345);
    }
}
