package fr.esiea.tools.solid.orchestra_ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrchestraEx2Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Exercice2() {
        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(new Wind());
        orchestra.addInstrument(new Percussion());
        orchestra.addInstrument(new Brass());
        orchestra.addInstrument(new Woodwind());
        orchestra.tuneAll();

        assertEquals("Wind.play()\r\n" +
                "Percussion.play()\r\n" +
                "Brass.play()\r\n" +
                "Woodwind.play()\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Exercice2() {
        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(new Wind());
        orchestra.addInstrument(new Percussion());
        orchestra.addInstrument(new Brass());
        orchestra.addInstrument(new Woodwind());
        orchestra.addInstrument(new Stringed());
        orchestra.tuneAll();

        assertEquals("Wind.play()\r\n" +
                "Percussion.play()\r\n" +
                "Brass.play()\r\n" +
                "Woodwind.play()\r\n" +
                "Stringed.play()\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}

