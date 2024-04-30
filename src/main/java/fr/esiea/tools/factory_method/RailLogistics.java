package fr.esiea.tools.factory_method;

public class RailLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
