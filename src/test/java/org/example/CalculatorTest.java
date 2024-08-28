package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals (4, calculator.add(2, 2));
    }

    @Test
    void sub() {
        assertEquals (0, calculator.sub(2, 2));
    }

    @Test
    void mul() {
        assertAll(() -> assertEquals (18, calculator.mul(6,3)),
                () ->assertEquals (4, calculator.mul(2, 2)),
                () -> assertEquals( 20, calculator.mul(5,4)))
        ;
    }
    @Test
    void div() {
        assertEquals (4,calculator.div(8,2));
    }

    @Test
    void dividebyzero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.div(2,0));
        assertEquals("Division by zero", exception.getMessage());
    }
}