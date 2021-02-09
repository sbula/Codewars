/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_6;

public class SumParts {

    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length+1];
        int sum = 0;
        result[ls.length] = 0;
        for(int i=ls.length-1; i>=0; i--) {
            sum += ls[i];
            result[i] = sum;
        }
        return result;
    }
}
