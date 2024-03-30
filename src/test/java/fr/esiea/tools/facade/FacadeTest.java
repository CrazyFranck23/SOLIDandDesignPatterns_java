package fr.esiea.tools.facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadeTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Facade() {
        Amplifier amp = new Amplifier("Amplifier");
        CdPlayer cd = new CdPlayer("CD Player");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        HomeMusicFacade homeMusic = new HomeMusicFacade(cd, lights, amp);
        homeMusic.listenCD("Ray of light");
        homeMusic.stopCD();

        assertEquals("Get ready to listen to Ray of light\r\n" +
                "Theater Ceiling Lights dimming to 10%\r\n" +
                "Amplifier on\r\n" +
                "Amplifier setting volume to 5\r\n" +
                "Amplifier surround sound on (5 speakers, 1 subwoofer)\r\n" +
                "CD Player on\r\n" +
                "CD Player playing \"Ray of light\"\r\n" +
                "CD Player playing track 0\r\n" +
                "CD Player playing track 1\r\n" +
                "CD Player playing track 2\r\n" +
                "CD Player playing track 3\r\n" +
                "CD Player playing track 4\r\n" +
                "Stop listening to CD\r\n" +
                "CD Player stopped\r\n" +
                "CD Player eject\r\n" +
                "CD Player off\r\n" +
                "Amplifier setting volume to 0\r\n" +
                "Amplifier off\r\n" +
                "Theater Ceiling Lights on\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}

