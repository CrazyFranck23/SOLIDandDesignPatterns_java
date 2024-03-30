package fr.esiea.tools.solid.orchestra_ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrchestraEx1Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testExercice1() {
        Orchestra orchestra = new Orchestra();
        orchestra.addWind(new Wind());
        orchestra.addPercussion(new Percussion());
        orchestra.addWind(new Brass());
        orchestra.addWind(new Woodwind());
        orchestra.tuneAll();

        assertEquals("Wind.play()\r\n" +
                "Brass.play()\r\n" +
                "Woodwind.play()\r\n" +
                "Percussion.play()\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
