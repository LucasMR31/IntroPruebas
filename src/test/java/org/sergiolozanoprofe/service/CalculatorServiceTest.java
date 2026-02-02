package org.sergiolozanoprofe.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    public double add(int a, int b) {
        return (double) a + b;
    }

    public double subtract(int a, int b) {
        return (double) a - b;
    }

    public double multiply(int a, int b) {
        return (double) a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        return (double) a / b;
    }


    @Test
    void testSumar() {
        CalculatorService calc = new CalculatorService();
        int resultado = (int) calc.add(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testRestar() {
        CalculatorService calc = new CalculatorService();
        int resultado = (int) calc.subtract(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void testMultiplicar() {
        CalculatorService calc = new CalculatorService();
        int resultado = (int) calc.multiply(4, 2);
        assertEquals(8, resultado);
    }

    @Test
    void testDividir() {
        CalculatorService calc = new CalculatorService();
        int resultado = (int) calc.divide(10, 2);
        assertEquals(5, resultado);
    }
}
