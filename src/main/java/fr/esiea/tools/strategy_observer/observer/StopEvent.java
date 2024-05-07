package fr.esiea.tools.strategy_observer.observer;

import java.time.LocalDateTime;

public class StopEvent extends Event {
    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }

    @Override
    public  String getDescription() {
        return "StopEvent";
    }
}
