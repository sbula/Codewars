package ch.pitpula.codewars.kyu_7;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_7.HighesAndLowest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighesAndLowestTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighesAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
