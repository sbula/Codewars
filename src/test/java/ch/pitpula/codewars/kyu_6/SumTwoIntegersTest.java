package ch.pitpula.codewars.kyu_6;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static ch.pitbula.codewars.kyu_6.SumTwoIntegers.add;
import static org.junit.jupiter.api.Assertions.*;


class SumTwoIntegersTest {

    @Test
    @Disabled
    public void checkDisjunctBytes() {
        assertEquals(3, add(1, 2));
        assertEquals(3, 2, 1);
        assertEquals(6, add(4, 2));
    }

    @Test
    @Disabled
    public void checkPositiveValues() {
        assertEquals(3, add(1, 2));
        assertEquals(24, add(5, 19));
        assertEquals(40, add(23, 17));
        assertEquals(444, add(125, 319));
    }

    @Test
    @Disabled
    public void checkOverflowValues() {
        assertEquals(709, add(708,1));
        assertEquals(710, add(709,1));
    }

    @Test
    @Disabled
    public void checkNegativeValues() {
        assertEquals( -30, add(-14,-16));
        assertEquals(-226, add(-50,-176));
        assertEquals( -39, add(-10,-29));
    }

    @Test
    @Disabled
    public void checkMixtureValues() {
        assertEquals(  0, add(-13,13));
        assertEquals( -9, add(-27,18));
        assertEquals(-60, add(-90,30));
    }

}