package fr.esiea.tools.factory_method;

public abstract class Logistics {
    public Transport transport;
    public void planDelivery(String destination) {

    }

    public Transport createTransport() {
        return null;
    }
}
