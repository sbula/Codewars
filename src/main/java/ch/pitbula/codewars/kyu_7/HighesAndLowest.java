package ch.pitbula.codewars.kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighesAndLowest {
    public static String highAndLow(String numbers) {
        List<Integer> intList = Arrays.asList(numbers.split(" ", 0))
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return Collections.max(intList) + " " + Collections.min(intList);
    }
}
