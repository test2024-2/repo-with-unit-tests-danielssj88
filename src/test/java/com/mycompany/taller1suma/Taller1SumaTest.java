package com.mycompany.taller1suma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Taller1SumaTest {
    
    @Test
    public void testSumarPositiveNumbers() {
        assertEquals(5, Taller1Suma.sumar(2, 3), "Sum of 2 and 3 should be 5");
    }

    @Test
    public void testSumarNegativeNumbers() {
        assertEquals(-5, Taller1Suma.sumar(-2, -3), "Sum of -2 and -3 should be -5");
    }

    @Test
    public void testSumarPositiveAndNegativeNumbers() {
        assertEquals(0, Taller1Suma.sumar(2, -2), "Sum of 2 and -2 should be 0");
    }

    @Test
    public void testSumarZero() {
        assertEquals(0, Taller1Suma.sumar(0, 0), "Sum of 0 and 0 should be 0");
    }

    @Test
    public void testSumarLargeNumbers() {
        assertEquals(2000000, Taller1Suma.sumar(1000000, 1000000), "Sum of 1000000 and 1000000 should be 2000000");
    }
}
