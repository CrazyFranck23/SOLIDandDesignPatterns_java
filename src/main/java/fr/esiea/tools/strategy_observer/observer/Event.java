package fr.esiea.tools.strategy_observer.observer;

import java.time.LocalDateTime;

abstract class Event {
    public abstract LocalDateTime getCurrentTime();
    public abstract String getDescription();
}
