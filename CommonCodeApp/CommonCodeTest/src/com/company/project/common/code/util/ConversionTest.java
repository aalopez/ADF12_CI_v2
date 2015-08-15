package com.company.project.common.code.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConversionTest {
    public ConversionTest() {
    }

    /**
     * @see Conversion#toInt(String)
     */
    @Test
    public void testToInt() {
        Conversion conv = new Conversion();
        String num = "2";
        assertEquals("Conversión correcta", 2, conv.toInt(num));

        num = "ERROR";
        try {
            conv.toInt(num);
            fail("Conversión de texto a entero debe fallar");
        } catch (RuntimeException ex) {
        }
    }
}
