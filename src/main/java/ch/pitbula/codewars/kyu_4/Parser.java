package ch.pitbula.codewars.kyu_4;

import java.util.Arrays;

public class Parser {
    public static int parseInt(String numStr) {
        int[] numArray = Arrays.stream(numStr.split("\\s|-"))
                .mapToInt(Parser::parseSimpleNbr)
                .toArray();
        int res = 0;
        int tmp = 0;
        for (int value : numArray) {
            if (value < 100) {
                tmp += value;
            } else if (value == 100) {
                tmp = Math.max(1, tmp) * value;
            } else { // --> numArray[i]>100
                res += Math.max(1, tmp) * value;
                tmp = 0;
            }
        }
        return res + tmp;
    }

    private static int parseSimpleNbr (String nbrString){
        int nbr = 0;
        switch (nbrString.toLowerCase()) {
            case "zero": nbr = 0; break;
            case "one": nbr = 1; break;
            case "two": nbr = 2;  break;
            case "three": nbr = 3; break;
            case "four": nbr = 4;  break;
            case "five": nbr = 5; break;
            case "six": nbr = 6; break;
            case "seven": nbr = 7; break;
            case "eight": nbr = 8; break;
            case "nine": nbr = 9; break;
            case "ten": nbr = 10;  break;
            case "eleven": nbr = 11; break;
            case "twelve": nbr = 12; break;
            case "thirteen": nbr = 13; break;
            case "fourteen": nbr = 14; break;
            case "fifteen": nbr = 15; break;
            case "sixteen": nbr = 16; break;
            case "seventeen": nbr = 17; break;
            case "eighteen": nbr = 18; break;
            case "nineteen": nbr = 19; break;
            case "twenty": nbr = 20; break;
            case "thirty": nbr = 30; break;
            case "forty": nbr = 40; break;
            case "fifty": nbr = 50; break;
            case "sixty": nbr = 60; break;
            case "seventy":  nbr = 70; break;
            case "eighty": nbr = 80; break;
            case "ninety": nbr = 90; break;
            case "hundred": nbr = 100; break;
            case "thousand": nbr = 1000; break;
            case "million": nbr = 1000000; break;
        }
        return nbr;
    }
}
