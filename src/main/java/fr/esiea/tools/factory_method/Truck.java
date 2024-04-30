package fr.esiea.tools.factory_method;

public class Truck extends Delivery implements Transport {
    private Delivery deliveryMeans;
    public Truck(String deliveryMeans) {
        super(deliveryMeans);
    }

    @Override
    public String deliver(String destination) {
        return null;
    }
}
