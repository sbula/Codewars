package ch.pitpula.codewars.kyu_8;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_8.Multiply;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest {

    @Test
    public void test1() {
        assertEquals(2.0, Multiply.multiply(1.0, 2.0));
        assertEquals(-2.0, Multiply.multiply(-1.0, 2.0));
        assertEquals(-2.0, Multiply.multiply(1.0, -2.0));
        assertEquals(2.0, Multiply.multiply(-1.0, -2.0));
        assertEquals(0.0, Multiply.multiply(0.0, 2.0));
        assertEquals(-3.0, Multiply.multiply(1.5, -2.0));
    }
}
