/*
 * Copyright (c) 2021. by Steve Bula
 */

package ch.pitbula.codewars.kyu_7;

public class JumpingNumber {
    public static String jumpingNumber(int number)
    {
        if (number<10) return "Jumping!!";

        int digit = number%10;
        number = number/10;
        while (number>0) {
            int nextDigit = number%10;
            if ((digit-nextDigit) != 1 && (digit-nextDigit) != -1 ) return "Not!!";
            digit = nextDigit;
            number /=10;
        }
        return "Jumping!!";
    }
}
