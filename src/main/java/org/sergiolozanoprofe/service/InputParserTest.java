package org.sergiolozanoprofe.service;


import org.sergiolozanoprofe.util.InputParser;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputParserTest {

    @Test
    void testParseInputCorrecto() {
        InputParser parser = new InputParser();
        String[] resultado = parser.parse("3 + 4");

        assertEquals("3", resultado[0]);
        assertEquals("+", resultado[1]);
        assertEquals("4", resultado[2]);
    }

    @Test
    void testParseInputConEspacios() {
        InputParser parser = new InputParser();
        String[] resultado = parser.parse(" 10   *   2 ");

        assertEquals("10", resultado[0]);
        assertEquals("*", resultado[1]);
        assertEquals("2", resultado[2]);
    }

}
