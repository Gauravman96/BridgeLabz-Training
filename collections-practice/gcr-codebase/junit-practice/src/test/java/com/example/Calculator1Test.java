package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class Calculator1Test {

    Calculator calculator = new Calculator();

    @Test
    void testDivideByZeroException() {

        // Exception verify karne ka BEST way
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    calculator.divide(10, 0);
                });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivideSuccess() {
        assertEquals(5, calculator.divide(10, 2));
    }
}
