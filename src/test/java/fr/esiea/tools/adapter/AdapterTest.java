package fr.esiea.tools.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdapterTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1Adapter() {
        ICreditCard cc = new CreditCardAdapter();
        CreditCardUser ccu = new CreditCardUser(cc);
        ccu.displayMyCreditCardDetails(12);

        assertEquals("12 - Bank1 - Name1\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test2Adapter() {
        ICreditCard cc = new CreditCardAdapter();
        CreditCardUser ccu = new CreditCardUser(cc);
        ccu.displayMyCreditCardDetails(34);

        assertEquals("34 - Bank2 - Name2\r\n", outputStreamCaptor.toString());
    }

    @Test
    public void test3Adapter() {
        ICreditCard cc = new CreditCardAdapter();
        CreditCardUser ccu = new CreditCardUser(cc);
        ccu.displayMyCreditCardDetails(56);

        assertEquals("56 - Bank3 - Name3\r\n", outputStreamCaptor.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}

