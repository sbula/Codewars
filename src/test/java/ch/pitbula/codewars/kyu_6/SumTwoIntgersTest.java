package ch.pitbula.codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumTwoIntgersTest {
    @Test
    public void checkPositiveValues() {
        assertEquals(3, SumTwoIntgers.add(1, 2));
        assertEquals(24, SumTwoIntgers.add(5, 19));
        assertEquals(40, SumTwoIntgers.add(23, 17));
        assertEquals(444, SumTwoIntgers.add(125, 319));
    }

    @Test
    public void checkOverflowValues() {
        assertEquals(709, SumTwoIntgers.add(708,1));
        assertEquals(710, SumTwoIntgers.add(709,1));
    }

    @Test
    public void checkNegativeValues() {
        assertEquals( -30, SumTwoIntgers.add(-14,-16));
        assertEquals(-226, SumTwoIntgers.add(-50,-176));
        assertEquals( -39, SumTwoIntgers.add(-10,-29));
    }

    @Test
    public void checkMixtureValues() {
        assertEquals(  0, SumTwoIntgers.add(-13,13));
        assertEquals( -9, SumTwoIntgers.add(-27,18));
        assertEquals(-60, SumTwoIntgers.add(-90,30));
    }

}
