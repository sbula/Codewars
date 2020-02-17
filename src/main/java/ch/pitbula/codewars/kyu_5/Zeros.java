package ch.pitbula.codewars.kyu_5;

public class Zeros {
    public static int zeros(int n) {
        int counter = 0;
        n /= 5;
        while (n>0) {
            counter += n;
            n /= 5;
        }
        return counter;
    }
}

