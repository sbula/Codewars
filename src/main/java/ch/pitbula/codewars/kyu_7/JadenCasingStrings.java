package ch.pitbula.codewars.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0)
            return null;
        return Arrays.asList(String.valueOf(phrase).split(" "))
                .stream()
                .map(word -> word.substring(0,1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
