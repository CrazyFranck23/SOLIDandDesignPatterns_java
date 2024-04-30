package fr.esiea.tools.factory_method;

public class Ship implements Transport {
    private Delivery deliveryMeans;
    public Ship() {
        this.deliveryMeans = new Delivery("ship");
    }

    @Override
    public String deliver(String destination) {
        return "Ship to " + destination;
    }
}
