/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_3;import java.math.BigInteger;

public class TheMillionthFibonacci {
    public static BigInteger fib(BigInteger n) {
        int nbr = n.intValue();
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int bit = Integer.highestOneBit(nbr); bit != 0; bit >>>= 1) {
            // Loop invariant: a = F(m), b = F(m+1)
            // Double it
            BigInteger d = a.multiply(b.shiftLeft(1).subtract(a));
            BigInteger e = a.multiply(a).add(b.multiply(b));
            a = d;
            b = e;
            m *= 2;

            // Advance by one conditionally
            if ((nbr & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
            }
        }
        return a;
    }
}
