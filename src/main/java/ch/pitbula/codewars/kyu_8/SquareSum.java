package ch.pitbula.codewars.kyu_8;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(x -> x*x)
                .reduce((x, y) -> x+y)
                .getAsInt();
    }
}
