package fr.esiea.tools.strategy_observer.athletics;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Event e, AthleticsRace ar);
}
