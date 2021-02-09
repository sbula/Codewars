/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_6;

public class RowOfTheOddTriangle {
    public static long[] oddRow(int n) {
        long[] res = new long[n];
        res[0] = (long) n * (n-1) +1;
        for (int p=1; p<n; p++)  {
            res[p] = res[p-1] + 2;
        }
        return res;
    }
}
