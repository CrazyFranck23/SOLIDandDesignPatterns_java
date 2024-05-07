package fr.esiea.tools.strategy_observer.observer;

import java.time.LocalDateTime;
import java.util.*;

public class Runner implements Subject {
    private Event event;
    private List<Observer> observers;
    public Runner() {
        observers = new ArrayList<Observer>();
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void runEvent() {
        notifyObservers(event);

    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(Event e) {
        for (Observer observer : observers) {
            observer.update(e);
        }

    }
}
