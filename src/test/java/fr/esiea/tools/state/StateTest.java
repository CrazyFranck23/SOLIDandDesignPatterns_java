package fr.esiea.tools.state;

import fr.esiea.tools.factory_method.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StateTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1State() {
        Document d1 = new Document();
        System.out.println(d1);

        assertEquals("NoState\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2State() {
        Document d = new Document();
        System.out.println(d);   //NoState
        d.createDocument();
        System.out.println(d);   //Draft
        d.reviewDocument();
        System.out.println(d);   //Moderation
        d.reviewDocument();
        System.out.println(d);   //Moderation
        d.reviewDocument();
        System.out.println(d);   //Removed

        assertEquals("NoState\r\n" +
                "DraftState\r\n" +
                "ModerationState\r\n" +
                "ModerationState\r\n" +
                "RemovedState\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3State() {
        Document d = new Document();
        System.out.println(d);   //NoState
        d.createDocument();
        System.out.println(d);   //Draft
        d.reviewDocument();
        System.out.println(d);   //Moderation
        d.reviewDocument();
        System.out.println(d);   //Moderation
        d.publishDocument();
        System.out.println(d);   //Published

        assertEquals("NoState\r\n" +
                "DraftState\r\n" +
                "ModerationState\r\n" +
                "ModerationState\r\n" +
                "PublishedState\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test4State() {
        Document d3 = new Document();
        d3.createDocument();
        System.out.println(d3);  //Draft
        d3.publishDocument();
        System.out.println(d3);   //Draft

        assertEquals("DraftState\r\n" +
                "DraftState\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test5State() {
        Document d4 = new Document();
        System.out.println(d4);  //NoState
        d4.publishDocument();
        System.out.println(d4);   //NoState

        assertEquals("NoState\r\n" +
                "NoState\r\n", outputStreamCaptor.toString());
    }


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}

