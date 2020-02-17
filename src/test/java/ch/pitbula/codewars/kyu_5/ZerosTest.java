package ch.pitbula.codewars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZerosTest {
    @Test
    public void testZeros() throws Exception {
        assertEquals(0, Zeros.zeros(0));
        assertEquals(1, Zeros.zeros(6));
        assertEquals(2, Zeros.zeros(14));
        assertEquals(6, Zeros.zeros(25));
        assertEquals(6, Zeros.zeros(26));
        assertEquals(24, Zeros.zeros(100));
        assertEquals(536870902, Zeros.zeros(Integer.MAX_VALUE));
    }

}
