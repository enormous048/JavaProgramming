package Day21_Utility_ForEach;

import java.util.Arrays;

public class NewMethods {
    public static void main(String[] args) {

        // .toCharArray()
        String surname = "kovalchuk";

        char[] sur2 = surname.toCharArray();
        char[] sur3 = "kovalchuk".toCharArray();

        System.out.println(Arrays.toString(sur2));

        for (char ch : sur2){
            System.out.println(ch);  //шо так шо так одинаково можна вивести кожний чар з стрінг
        }

        for (int i = 0; i <= surname.length()-1; i++) {
            System.out.println(surname.charAt(i));
        }



        // .split( bySomething )  -- Stores each word of string as a different item in string array

        String full = "naz kovalchuk vas";
        String[] array = full.split(" "); //сплітить стрінг там де є кожен пробіл
        System.out.println(Arrays.toString(array));

        String[] abc = "ABC".split(""); // {"A", "B", "C"}

        //if you wanna split by a dot you should add   split(\\.)
    }
}
