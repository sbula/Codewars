package ch.pitpula.codewars.kyu_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_6.SumTwoIntgersUsingExp;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumTwoIntgersUsingExpTest {
    @Test
    public void checkPositiveValues() {
        assertEquals(3, SumTwoIntgersUsingExp.add(1, 2));
        assertEquals(24, SumTwoIntgersUsingExp.add(5, 19));
        assertEquals(40, SumTwoIntgersUsingExp.add(23, 17));
        assertEquals(444, SumTwoIntgersUsingExp.add(125, 319));
    }

    @Test
    public void checkOverflowValues() {
        assertEquals(709, SumTwoIntgersUsingExp.add(708,1));
        Assertions.assertThrows(NumberFormatException.class, () -> SumTwoIntgersUsingExp.add(709,1));
    }

    @Test
    public void checkNegativeValues() {
        assertEquals( -30, SumTwoIntgersUsingExp.add(-14,-16));
        assertEquals(-226, SumTwoIntgersUsingExp.add(-50,-176));
        assertEquals( -39, SumTwoIntgersUsingExp.add(-10,-29));
    }

    @Test
    public void checkMixtureValues() {
        assertEquals(  0, SumTwoIntgersUsingExp.add(-13,13));
        assertEquals( -9, SumTwoIntgersUsingExp.add(-27,18));
        assertEquals(-60, SumTwoIntgersUsingExp.add(-90,30));
    }

}
