package fr.esiea.tools.strategy_observer.observer;

import java.time.LocalDateTime;

public class MockStartEvent  extends Event {

    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.of(2023, 1, 3, 10, 15, 25, 6777);
    }

    @Override
    public String getDescription() {
        return "StartEvent";
    }
}
