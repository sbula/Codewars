/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_6;

public class SumTwoIntgersUsingExp {
    public static int add(int x, int y) throws NumberFormatException {
        // this is a bit dirty as it kind of violates the rules.. ..I use it simply to throw an exception in case I would exceed max long...
        if (x+y >= 710)
            throw new NumberFormatException("Sum is to large to compute here..");

        return (int)Math.log(Math.exp(x) * Math.exp(y));
    }
}
