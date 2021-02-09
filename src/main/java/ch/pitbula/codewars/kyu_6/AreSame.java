/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_6;

import java.util.Arrays;

public class AreSame {

//    a = [121, 144, 19, 161, 19, 144, 19, 11]
//    b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
//    ==> true

    public static boolean comp(int[] a, int[] b) {
        if (a == null) return b == null;
        if (b == null) return false;
        Object[] ao = Arrays.stream(a).map(x -> x*x).sorted().boxed().toArray();
        Object[] bo = Arrays.stream(b).sorted().boxed().toArray();

        return Arrays.deepEquals(ao,bo);
    }
}
