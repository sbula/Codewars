package ch.pitbula.codewars.kyu_6;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Long> freq = text.toLowerCase()
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Predicate<Long> dublicate = i-> i > 1;
        return (int)freq.values().stream().filter(dublicate).count();
    }
}
