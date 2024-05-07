package fr.esiea.tools.strategy_observer.observer;

public class RunningDisplay implements Observer, Display {
    private Event event;

    @Override
    public void update(Event e) {
        event = e;
        display();
    }

    @Override
    public void display() {
        System.out.println(event.getDescription() + " " + event.getCurrentTime());
    }
}
