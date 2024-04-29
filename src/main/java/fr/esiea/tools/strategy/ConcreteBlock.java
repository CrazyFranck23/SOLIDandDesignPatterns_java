package fr.esiea.tools.strategy;

public class ConcreteBlock implements IMaterial {
    public String getName() {
        String message = "I build with concrete block material";
        return message;
    }
}
