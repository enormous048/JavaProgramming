package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp3 {
    public static void main(String[] args) {
        String str = "123asd456avtfgd76543%$#@!kks(*&";

        ArrayList<Character> allElements = new ArrayList<>();
        for (int i = 0; i <=  str.length()-1; i++) {
            allElements.add(str.charAt(i));
        }

        ArrayList<Character> arrListLetters = new ArrayList<>(allElements);
        ArrayList<Character> arrListDigits = new ArrayList<>(allElements);
        ArrayList<Character> arrListSpecial = new ArrayList<>(allElements);

        arrListLetters.removeIf(p -> !Character.isLetter(p));
        arrListDigits.removeIf(p -> !Character.isDigit(p));
        arrListSpecial.removeIf(p -> Character.isLetterOrDigit(p)); //or removeAll arrListDigits, arrListLetters

        System.out.println("arrListLetters = " + arrListLetters);
        System.out.println("arrListDigits = " + arrListDigits);
        System.out.println("arrListSpecial = " + arrListSpecial);

    }
}
