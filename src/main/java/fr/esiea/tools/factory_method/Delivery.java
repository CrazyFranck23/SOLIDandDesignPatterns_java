package fr.esiea.tools.factory_method;

public class Delivery {
    private String deliveryMeans;
    private String destination;

    public Delivery(String deliveryMeans) {}

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return this.destination;
    }
}
