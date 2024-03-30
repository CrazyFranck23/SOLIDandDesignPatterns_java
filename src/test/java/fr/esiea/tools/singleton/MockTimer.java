package fr.esiea.tools.singleton;

import java.time.LocalDateTime;

public class MockTimer implements Timer {
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.of(2023, 3, 21, 4, 6, 35, 2345);
    }
}
