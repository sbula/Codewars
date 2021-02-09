/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BalancedNumber {
    public static String balancedNum(long number) {
        List<Integer> myNbr = Arrays.stream(String.valueOf(number).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int leftW = myNbr.subList(0, Math.max(0, Math.round((myNbr.size()-1)/2)))
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        int rightW = myNbr.subList(Math.round((myNbr.size())/2+1), myNbr.size())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        if (leftW == rightW) return "Balanced";
        return "Not Balanced";
    }
}
