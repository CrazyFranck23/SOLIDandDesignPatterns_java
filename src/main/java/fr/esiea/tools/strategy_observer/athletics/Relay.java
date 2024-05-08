package fr.esiea.tools.strategy_observer.athletics;

public class Relay implements AthleticsRace {
    private String name;
    @Override
    public String getName() {
        return "Relay";
    }
}
