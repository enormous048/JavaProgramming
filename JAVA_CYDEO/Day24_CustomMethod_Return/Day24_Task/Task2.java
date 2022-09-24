package Day24_CustomMethod_Return.Day24_Task;

import java.util.Arrays;

public class Task2 {

    public static int freqOfWord(String sentence, String word){

        int result = 0;
        String[] arr = sentence.toLowerCase().split(" ");

        for (String s : arr) {
            if (s.equals(word)){
                result++;
            }
        }

        return result;

    }

    public static boolean isAnagram(String first, String second){
        boolean result = false;

        char[] chFirst = first.toCharArray();
        char[] chSecond = second.toCharArray();

        Arrays.sort(chFirst);
        Arrays.sort(chSecond);

        if (chFirst == chSecond){
            result = true;
        }else{
            result = false;
        }

        return result;

    }

    public static void main(String[] args) {
        String sentence = "Java is great Java is fine";
        String word = "java";

        int newresult = freqOfWord(sentence, word);
        System.out.println("frequency of word " +word+ " is " + newresult);




        boolean isAnagram = isAnagram("lol", "oll");//true
        System.out.println(isAnagram);


    }
}
