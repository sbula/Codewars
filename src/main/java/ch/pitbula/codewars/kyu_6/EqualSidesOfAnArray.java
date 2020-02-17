package ch.pitbula.codewars.kyu_6;

import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        long rightSum = Arrays.stream(arr).sum();
        long leftSum = 0;
        for (int x = 0; x < arr.length; x++) {
            rightSum -= arr[x];
            if (rightSum == leftSum)
                return x;
            leftSum += arr[x];
        }
        return -1;
    }
}
