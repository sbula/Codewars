package ch.pitbula.codewars.kyu_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DigitizerTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Digitizer.digitize(35231));
    }
}
