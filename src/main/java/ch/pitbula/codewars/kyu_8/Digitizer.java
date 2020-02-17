package ch.pitbula.codewars.kyu_8;

public class Digitizer {
    public static int[] digitize(long n) {
        char[] chars = Long.toString(n).toCharArray();
        int[] ints = new int[chars.length];
        for (int i=0; i<chars.length; i++) {
            ints[i] = Integer.parseInt(Character.toString(chars[chars.length-1-i]));
        }
        return ints;
    }
}
