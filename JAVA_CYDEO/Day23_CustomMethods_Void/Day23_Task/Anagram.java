package Day23_CustomMethods_Void.Day23_Task;

import java.util.Arrays;

public class Anagram {

    public static void anagram(String str1, String str2){

        char[] arr = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);


        if (Arrays.equals(arr, arr2)){
            System.out.println(str1 +" and "+ str2 + " are anagram words");
        }else {
            System.out.println(str1 +" and "+ str2 + " are NOT anagram words");

        }


    }



    public static void main(String[] args) {

        anagram("nazar", "razan");

    }
}
