package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String  str){
        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverses the given string and returns the reversed string
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result+= str.charAt(i);
        }
        return result;
    }

    //returns the frequency of given char at given string
    public static int frequencyOfChar(String str, char ch){

        int count = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return  count;


    }

    //returns the frequency of all chars at given string
    public static String frequencyOfAll(String str){
        String result = "";


        for (int j = 0; j <= str.length()-1; j++) { //зафіксовуєм певний чар(j)

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) { //порівнюєм зафіксований чар зі всіма в стрінгу
                if (ch == str.charAt(i)) {
                    count++; //додаєм частоту якшо найшлися, ну як мінімум 1 буде бо вже зафіксували якись чар
                }
            }
            if (result.contains(""+ch)) { //якшо зафіксований чар вже попадався раніше і був записаний в резулт, то ітерація пропускається
                continue;
            }

            result+= ch+""+count; //додаєм зафіксований чар і його частоту

        }

        return result;
    }

    //returns unique chars from given string
    public static String uniqueChars(String str){

        String result = "";

        for (int j = 0; j <= str.length()-1; j++) {


            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result += "" + str.charAt(j);
            }
        }
        return result;
    }

    //returns true if the given string is palindrome
    public static boolean isPalindrome(String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse.equalsIgnoreCase(str);

    }

    //returns true if two given string are anagram
    public static boolean isAnagram(String str, String str2){

        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    //removes duplicate chars from given string, returns String
    public static String removeDuplicate(String str){
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }
        return result;

    }

    // returns true if given char is unique at given string
    public static boolean isUnique(String str, char ch){

        boolean result = false;


        int count = 0;
        for (int i = 0; i <= str.length()-1; i++) {

            if (ch == str.charAt(i)){
                count++;
            }
        }
        if (count == 1){
            result =  true;
        }
        return result;

    }







}
