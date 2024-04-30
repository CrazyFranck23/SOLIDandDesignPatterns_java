package fr.esiea.tools.factory_method;

public class Delivery {
    private final String deliveryMeans; // constante après initialisation
    private String destination;

    public Delivery(String deliveryMeans) {
        this.deliveryMeans = deliveryMeans; // Voici là ou la constante a été initialisé
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return this.destination;
    }
}
