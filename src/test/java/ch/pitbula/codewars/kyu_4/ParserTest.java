package ch.pitbula.codewars.kyu_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTest {

    @Test
    public void fixedTests() {
        assertEquals(1 , Parser.parseInt("one"));
        assertEquals(20 , Parser.parseInt("twenty"));
        assertEquals(246 , Parser.parseInt("two hundred forty-six"));
        assertEquals(146 , Parser.parseInt("one hundred forty six"));
        assertEquals(146 , Parser.parseInt("one hundred forty and six"));
        assertEquals(146 , Parser.parseInt("hundred forty-six"));
        assertEquals(459196 , Parser.parseInt("four hundred fifty nine thousand one hundred ninety six"));
        assertEquals(459196 , Parser.parseInt("four hundred fifty nine thousand one hundred and ninety six"));
        assertEquals(1046 , Parser.parseInt("thousand and forty-six"));
    }

}
