package fr.esiea.tools.solid.orchestra_ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrchestraEx3Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Exercice3() {
        Orchestra orchestra = new Orchestra();
        //compose the orchestra:
        orchestra.addInstrument(new Percussion());
        orchestra.addInstrument(new Trombone());
        orchestra.addInstrument(new Guitar());
        orchestra.addInstrument(new Violin());
        orchestra.addInstrument(new Flute());
        orchestra.tuneAll();

        assertEquals("Percussion.play()\r\n" +
                "Trombone plays like an Instrument\r\n" +
                "Guitar plays like an Instrument\r\n" +
                "Violin plays like an Instrument\r\n" +
                "Flute plays like an Instrument\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Exercice3() {
        Orchestra orchestra = new Orchestra();
        //add some special instruments (solo)
        orchestra.tuneTenor(new Trombone());
        orchestra.tuneSoprano(new Violin());
        orchestra.tuneSoprano(new Flute());
        orchestra.tuneTenor(new Guitar());
        orchestra.tuneSoprano(new Guitar());

        assertEquals("Trombone plays like a Tenor\r\n" +
                "Violin plays like a Soprano\r\n" +
                "Flute plays like a Soprano\r\n" +
                "Guitar plays like a Tenor\r\n" +
                "Guitar cannot play like a Soprano\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}


