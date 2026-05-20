package com.campuskart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        int result = calculator.subtract(20, 10);

        assertEquals(10, result);
    }

    @Test
    public void testMultiplication() {

        int result = calculator.multiply(5, 5);

        assertEquals(25, result);
    }

    @Test
    public void testDivision() {

        int result = calculator.divide(20, 5);

        assertEquals(4, result);
    }
}