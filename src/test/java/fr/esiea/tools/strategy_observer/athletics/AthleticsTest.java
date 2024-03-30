package fr.esiea.tools.strategy_observer.athletics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AthleticsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Athletics() {
        Runner runner = new ShortDistanceRunner();
        runner.setAthleticsRace(new Relay());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("Relay StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Athletics() {
        Runner runner = new ShortDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3Athletics() {
        Runner runner = new ShortDistanceRunner();
        runner.setAthleticsRace(new FourHundredMeters());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("FourHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }
    @Test
    public void test4Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new Relay());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();
        assertEquals("Relay StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test5Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test6Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new FourHundredMeters());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("FourHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test7Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test8Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test9Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();
        runner.setAthleticsRace(new Relay());
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test10Athletics() {
        Runner runner = new LongDistanceRunner();
        runner.setAthleticsRace(new OneHundredMeters());
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.removeObserver(trd1);
        runner.removeObserver(trd2);
        runner.setAthleticsRace(new Relay());
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "OneHundredMeters StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "Relay StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
