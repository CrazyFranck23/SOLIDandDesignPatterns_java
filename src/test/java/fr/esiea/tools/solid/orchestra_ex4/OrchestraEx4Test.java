package fr.esiea.tools.solid.orchestra_ex4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrchestraEx4Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Exercice4() {
        Orchestra o = new Orchestra();
        Instrument ww = new Woodwind();
        o.addInstrument(ww);
        Instrument p = new Percussion();
        o.addInstrument(p);
        Instrument bi = new Brass();
        o.addInstrument(bi);

        o.tuneAll();

        assertEquals("Woodwind.play()\r\n" +
                "Percussion.play()\r\n" +
                "Brass.play()\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Exercice4() {
        Orchestra o = new Orchestra();
        Instrument bi = new Brass();
        o.addInstrument(bi);

        CanBePaused b = new Brass();
        o.addInstrumentThatCanBePaused(b);
        CanBePaused b1 = new Brass();
        o.addInstrumentThatCanBePaused(b1);

        o.tuneAll();
        o.pauseInstruments();

        assertEquals("Brass.play()\r\n" +
                "Brass.play()\r\n" +
                "Brass.play()\r\n" +
                "Brass.pause()\r\n" +
                "Brass.pause()\r\n", outputStreamCaptor.toString());
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}



