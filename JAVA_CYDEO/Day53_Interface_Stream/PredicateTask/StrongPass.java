package Day53_Interface_Stream.PredicateTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StrongPass {
    public static void main(String[] args) {

        Predicate<String> isStrong = (str) ->{

            boolean result = false;
            boolean hasDigit = false;
            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasSpecial = false;
            boolean lengthSpace = false;
            char[] chArr = str.toCharArray();

            if (str.length()>=8 && !str.contains(" ")){
                lengthSpace = true;
            }
            for (char c : chArr) {
                if (Character.isDigit(c)){
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecial = true;
                }
            }

            if (hasDigit && hasUpper && hasLower && hasSpecial && lengthSpace){
                result = true;
            }
            return result;
        };

        System.out.println(isStrong.test("Nazar_048"));



    }
}
