package com.mycompany.taller1suma;

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Taller1SumaMainTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testMainMethodOutputsCorrectSum() {
        provideInput("3\n4\n");
        String expectedOutput = "Ingresa el número 1\nIngresa el número 2\nLa suma es 7\n";
        
        Taller1Suma.main(new String[0]);

        assertTrue(getOutput().contains(expectedOutput));
    }
}
