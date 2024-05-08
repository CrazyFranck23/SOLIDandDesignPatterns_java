package fr.esiea.tools.strategy_observer.athletics;

import java.util.*;

abstract class Runner implements Subject {
    private Event event;
    private AthleticsRace ar;
    private List<Observer> observers = new ArrayList<Observer>();
//    public Runner(AthleticsRace ar) {
//        observers = new ArrayList<Observer>();
//    }
    public Runner() {}
    public void setEvent(Event e) {
        event = e;
    }
    public void runEvent() {
        notifyObservers(event, ar);
    }
    public void setAthleticsRace(AthleticsRace ar) {
        this.ar = ar;
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(Event e, AthleticsRace ar) {
        for (Observer observer : observers) {
            observer.update(e,ar);
        }
    }
}
