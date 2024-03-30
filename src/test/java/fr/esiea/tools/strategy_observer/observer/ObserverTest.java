package fr.esiea.tools.strategy_observer.observer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Observer() {
        Runner runner = new Runner();
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();

        assertEquals("StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());

    }

    @Test
    public void test2Observer() {
        Runner runner = new Runner();
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3Observer() {
        Runner runner = new Runner();
        Observer trd = new RunningDisplay();
        runner.registerObserver(trd);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test4Observer() {
        Runner runner = new Runner();
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();

        assertEquals("StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test5Observer() {
        Runner runner = new Runner();
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test6Observer() {
        Runner runner = new Runner();
        Observer trd1 = new RunningDisplay();
        runner.registerObserver(trd1);
        Observer trd2 = new RunningDisplay();
        runner.registerObserver(trd2);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();
        runner.removeObserver(trd1);
        runner.removeObserver(trd2);
        Observer trd3 = new RunningDisplay();
        runner.registerObserver(trd3);
        runner.setEvent(new MockStartEvent());
        runner.runEvent();
        runner.setEvent(new MockStopEvent());
        runner.runEvent();

        assertEquals("StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StartEvent 2023-01-03T10:15:25.000006777\r\n" +
                "StopEvent 2023-01-03T10:15:25.000006777\r\n", outputStreamCaptor.toString());
    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
