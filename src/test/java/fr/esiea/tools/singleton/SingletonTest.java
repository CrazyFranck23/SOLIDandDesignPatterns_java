package fr.esiea.tools.singleton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Singleton() {
        ILogger sl = SingletonFileLogger.getInstance();
        SingletonFileLogger.setTimer(new MockTimer());
        sl.write (Level.ERROR, "error!");
        OutputChecker.displayOutputFromFile();

        assertEquals("[2023-03-21T04:06:35.000002345] - ERROR - error!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Singleton() {
        ILogger sl = SingletonFileLogger.getInstance();
        SingletonFileLogger.setTimer(new MockTimer());
        sl.write (Level.WARNING, "warning!");
        OutputChecker.displayOutputFromFile();

        assertEquals("[2023-03-21T04:06:35.000002345] - WARNING - warning!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3Singleton() {
        ILogger sl = SingletonFileLogger.getInstance();
        SingletonFileLogger.setTimer(new MockTimer());
        sl.write (Level.INFO, "info!");
        OutputChecker.displayOutputFromFile();

        assertEquals("[2023-03-21T04:06:35.000002345] - INFO - info!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test4Singleton() {
        ILogger sl = SingletonFileLogger.getInstance();
        SingletonFileLogger.setTimer(new MockTimer());
        sl.write (Level.DEBUG, "debug!");
        OutputChecker.displayOutputFromFile();


        assertEquals("[2023-03-21T04:06:35.000002345] - DEBUG - debug!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test5Singleton() {
        ILogger sl = SingletonConsoleLogger.getInstance();
        SingletonConsoleLogger.setTimer(new MockTimer());
        sl.write (Level.ERROR, "error!");

        assertEquals("[2023-03-21T04:06:35.000002345] - ERROR - error!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test6Singleton() {
        ILogger sl = SingletonConsoleLogger.getInstance();
        SingletonConsoleLogger.setTimer(new MockTimer());
        sl.write (Level.WARNING, "warning!");

        assertEquals("[2023-03-21T04:06:35.000002345] - WARNING - warning!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test7Singleton() {
        ILogger sl = SingletonConsoleLogger.getInstance();
        SingletonConsoleLogger.setTimer(new MockTimer());
        sl.write (Level.INFO, "info!");

        assertEquals("[2023-03-21T04:06:35.000002345] - INFO - info!\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test8Singleton() {
        ILogger sl = SingletonConsoleLogger.getInstance();
        SingletonConsoleLogger.setTimer(new MockTimer());
        sl.write (Level.DEBUG, "debug!");

        assertEquals("[2023-03-21T04:06:35.000002345] - DEBUG - debug!\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
