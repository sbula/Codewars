/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_7;

public class Fusc {
    public static int fusc(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        if (n % 2 == 0) return fusc(n/2);
        return fusc(n/2) + fusc(n/2 +1);
    }
}
