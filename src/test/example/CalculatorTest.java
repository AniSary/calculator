package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator c = new Calculator();

    @Test
    void add() { assertEquals(5, c.add(2, 3)); }

    @Test
    void subtract() { assertEquals(-1, c.subtract(2, 3)); }

    @Test
    void multiply() { assertEquals(6, c.multiply(2, 3)); }

    @Test
    void divide() { assertEquals(2, c.divide(6, 3)); }

    @Test
    void divideByZero() { assertThrows(ArithmeticException.class, () -> c.divide(1, 0)); }
}