package ch.pitbula.codewars.kyu_6;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String res = "(" + numbers[0] + numbers[1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] +  "-"
                + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return res;
    }
}
