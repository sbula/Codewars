package ch.pitpula.codewars.kyu_6;

import ch.pitbula.codewars.kyu_6.AreSame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(AreSame.comp(a, b));
    }

}
