/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitpula.codewars.kyu_4;


import ch.pitbula.codewars.kyu_4.StripComments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StripCommentsTest {

    @Test
    public void stripComments_same() {
        final String text = "apples, pears\ngrapes\nbananas";
        assertEquals(text, StripComments.stripComments(text, new String[] { "4", "5" }));
    }

    @Test
    public void stripComments_whiteSpaces() {
        final String input = "apples, pears          \n   grapes \nbananas";
        final String expected = "apples, pears\n   grapes\nbananas";
        assertEquals(expected, StripComments.stripComments(input, new String[] { "4", "5" }));
    }

    @Test
    public void stripComments_oneMarker() {
        final String input = "apples, pears # and bananas\n  grapes  \nbananas !apples";
        final String expected = "apples, pears\n  grapes\nbananas !apples";
        assertEquals(expected, StripComments.stripComments(input, new String[] { "#" }));
    }

    @Test
    public void stripComments() {
        assertEquals("apples, pears\ngrapes\nbananas",
                StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );

        assertEquals("a\nc\nd",
                StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );

    }
}
