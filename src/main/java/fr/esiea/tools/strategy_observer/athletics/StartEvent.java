package fr.esiea.tools.strategy_observer.athletics;

import java.time.LocalDateTime;

public class StartEvent extends Event {
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
    public String getDescription() {
        return "StartEvent";
    }
}
