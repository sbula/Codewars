package ch.pitbula.codewars.kyu_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FuscTest {
    @Test
    public void tests() {
        assertEquals(0, Fusc.fusc(0));
        assertEquals(1, Fusc.fusc(1));
        assertEquals(21, Fusc.fusc(85));
    }

}
