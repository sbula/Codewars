package ch.pitpula.codewars.kyu_8;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_8.RemoveChars;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }

}
