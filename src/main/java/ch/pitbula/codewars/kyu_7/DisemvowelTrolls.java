package ch.pitbula.codewars.kyu_7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
