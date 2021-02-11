/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        return Arrays.stream(text.split("\n"))
                .map(line -> removeComment(line, commentSymbols))
                .map(String::stripTrailing)
                .collect(Collectors.joining("\n"));
    }

    private static String removeComment(String line, String[] symbols) {
        for (String cmdSymbol : symbols) {
            int index = line.indexOf(cmdSymbol);
            line = index<0 ? line : line.substring(0, index);
        }

        return line;
    }
}
