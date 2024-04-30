package fr.esiea.tools.factory_method;

public class Truck implements Transport {
    private Delivery deliveryMeans;
    public Truck() {
        this.deliveryMeans = new Delivery("truck");
    }

    @Override
    public String deliver(String destination) {
        return "Truck to " + destination;
    }
}
