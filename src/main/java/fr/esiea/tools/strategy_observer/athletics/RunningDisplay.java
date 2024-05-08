package fr.esiea.tools.strategy_observer.athletics;

public class RunningDisplay implements Observer, Display {
    private Event event;
    public void update(Event e, AthleticsRace ar) {
        event = e;
        display(ar);
    }
    public void display(AthleticsRace ar) {
        System.out.println(ar.getName() + " " + event.getDescription() + " " + event.getCurrentTime());
    }

    // A AFFICHER = "Relay StartEvent 2023-01-03T10:15:25.000006777\r\n";
}
