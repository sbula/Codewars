package ch.pitpula.codewars.kyu_6;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_6.PhoneNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}
