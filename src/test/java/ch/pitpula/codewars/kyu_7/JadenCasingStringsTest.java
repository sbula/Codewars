package ch.pitpula.codewars.kyu_7;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_7.JadenCasingStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCasingStringsTest {
    final JadenCasingStrings jadenCase = new JadenCasingStrings();

    @Test
    public void test() {
        // toJadenCase doesn't return a valide JadenCase String! try again please :)
        assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        // Must return null when the arg is null
        assertNull( jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        // Must return null when the arg is empty string
        assertNull( jadenCase.toJadenCase(""));
    }

}
