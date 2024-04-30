package fr.esiea.tools.factory_method;

public class Train implements Transport {
    private Delivery deliveryMeans;

    public Train() {}

    public String deliver (String destination) {
        return "Train to " + destination;
    }
}
