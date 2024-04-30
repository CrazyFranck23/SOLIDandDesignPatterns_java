package fr.esiea.tools.factory_method;

public class Train implements Transport {
    private Delivery deliveryMeans;
    public Train() {
        this.deliveryMeans = new Delivery("train");
    }

    @Override
    public String deliver (String destination) {
        return "Train to " + destination;
    }
}
