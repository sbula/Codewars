package ch.pitpula.codewars.kyu_7;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_7.BalancedNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedNumberTest {
    @Test
    public void Check_Balanced_Number()
    {
        assertEquals("Balanced", BalancedNumber.balancedNum(7));
        assertEquals("Balanced", BalancedNumber.balancedNum(959));
        assertEquals("Balanced", BalancedNumber.balancedNum(13));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(432));
        assertEquals("Balanced", BalancedNumber.balancedNum(424));
    }
    @Test
    public void Check_Larger_Number()
    {
        assertEquals("Not Balanced", BalancedNumber.balancedNum(1024));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(66545));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(295591));
        assertEquals("Not Balanced", BalancedNumber.balancedNum(1230987));
        assertEquals("Balanced", BalancedNumber.balancedNum(56239814));
    }

}
