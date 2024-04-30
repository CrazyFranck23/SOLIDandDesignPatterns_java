package fr.esiea.tools.factory_method;

public class Ship extends Delivery implements Transport {
    private Delivery deliveryMeans;

    public Ship(String deliveryMeans) {
        super(deliveryMeans);
    }

    @Override
    public String deliver(String destination) {
        return null;
    }
}
