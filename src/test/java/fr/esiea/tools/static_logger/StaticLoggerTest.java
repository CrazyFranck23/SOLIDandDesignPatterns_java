package fr.esiea.tools.static_logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticLoggerTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1StaticLogger() {
        StaticLogger.setTimer(new MockTimer());
        StaticLogger.write(Level.DEBUG, "exit");

        assertEquals("[2023-03-21T04:06:35.000002345] - DEBUG - exit\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2StaticLogger() {
        StaticLogger.setTimer(new MockTimer());
        StaticLogger.write(Level.WARNING, "warning!");

        assertEquals("[2023-03-21T04:06:35.000002345] - WARNING - warning!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3StaticLogger() {
        StaticLogger.setTimer(new MockTimer());
        StaticLogger.write(Level.ERROR, "error!");

        assertEquals("[2023-03-21T04:06:35.000002345] - ERROR - error!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test4StaticLogger() {
        StaticLogger.setTimer(new MockTimer());
        StaticLogger.write(Level.INFO, "information");

        assertEquals("[2023-03-21T04:06:35.000002345] - INFO - information\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
