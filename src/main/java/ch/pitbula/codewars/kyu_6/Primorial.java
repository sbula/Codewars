/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_6;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Primorial {
        public static String numPrimorial(int n) {
            return LongStream.range(2, Long.MAX_VALUE)
                    .mapToObj(BigInteger::valueOf) // map to BigInteger as we get some real big numbers...
                    .filter(prim -> prim.isProbablePrime(100)) // just get the prime numbers...
                    .limit(n)                      // Limit the number of primes here..
                    .reduce(BigInteger.ONE, BigInteger::multiply) // do the multiplication
                    .toString();
    }
}
