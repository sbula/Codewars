package ch.pitpula.codewars.kyu_7;

import org.junit.jupiter.api.Test;

import ch.pitbula.codewars.kyu_7.DisemvowelTrolls;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisemvowelTrollsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",DisemvowelTrolls.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrolls.disemvowel("What are you, a communist?"));
    }

}
