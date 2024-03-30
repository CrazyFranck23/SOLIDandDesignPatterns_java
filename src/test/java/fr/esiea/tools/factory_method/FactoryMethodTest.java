package fr.esiea.tools.factory_method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1FactoryMethod() {
        Logistics road = new RoadLogistics();
        road.planDelivery("Paris");

        assertEquals("Truck to Paris", outputStreamCaptor.toString());
    }

    @Test
    public void test2FactoryMethod() {
        Logistics sea = new SeaLogistics();
        sea.planDelivery("Marseille");

        assertEquals("Ship to Marseille", outputStreamCaptor.toString());
    }

    @Test
    public void test3FactoryMethod() {
        Logistics rail = new RailLogistics();
        rail.planDelivery("Strasbourg");

        assertEquals("Train to Strasbourg", outputStreamCaptor.toString());
    }

    @Test
    public void test4FactoryMethod() {
        SeaLogistics sl = new SeaLogistics();
        Transport t = sl.createTransport();
        System.out.println(t instanceof Ship);

        assertEquals("true\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test5FactoryMethod() {
        RoadLogistics rl = new RoadLogistics();
        Transport t = rl.createTransport();
        System.out.println(t instanceof Truck);

        assertEquals("true\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test6FactoryMethod() {
        RailLogistics rl = new RailLogistics();
        Transport t = rl.createTransport();
        System.out.println(t instanceof Train);

        assertEquals("true\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test7FactoryMethod() {
        Transport ship = new Ship();
        System.out.println(ship.deliver("Rotterdam"));

        assertEquals("Ship to Rotterdam\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test8FactoryMethod() {
        Transport truck = new Truck();
        System.out.println(truck.deliver("Laval"));

        assertEquals("Truck to Laval\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test9FactoryMethod() {
        Transport train = new Train();
        System.out.println(train.deliver("Ivry"));

        assertEquals("Train to Ivry\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}

