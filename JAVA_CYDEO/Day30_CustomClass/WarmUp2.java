package Day30_CustomClass;

import java.util.ArrayList;

public class WarmUp2 {
    public static void main(String[] args) {

        String str = "123asd456avtfgd76543%$#@!kks(*&";

        ArrayList<Character> arrListLetters = new ArrayList<>();
        ArrayList<Character> arrListDigits = new ArrayList<>();
        ArrayList<Character> arrListSpecial = new ArrayList<>();


        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (Character.isLetter(c)){
                arrListLetters.add(c);
            }else if (Character.isDigit(c)) {
                arrListDigits.add(c);
            }else if (!Character.isLetterOrDigit(c)) {
                arrListSpecial.add(c);
            }
        }

        System.out.println("arrListLetters = " + arrListLetters);
        System.out.println("arrListDigits = " + arrListDigits);
        System.out.println("arrListSpecial = " + arrListSpecial);


    }
}
