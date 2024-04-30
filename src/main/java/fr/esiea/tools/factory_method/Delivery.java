package fr.esiea.tools.factory_method;

public class Delivery {
    private final String deliveryMeans;
    private String destination;

    public Delivery(String deliveryMeans) {
        this.deliveryMeans = deliveryMeans;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return this.destination;
    }
}
