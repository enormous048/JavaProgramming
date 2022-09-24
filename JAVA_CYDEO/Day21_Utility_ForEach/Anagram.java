package Day21_Utility_ForEach;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";


        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str2.length()];

        ch1 = str1.toCharArray();
        ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println(anagram);
    }
}
