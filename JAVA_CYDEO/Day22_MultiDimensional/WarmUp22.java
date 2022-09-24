package Day22_MultiDimensional;

import java.util.Arrays;

public class WarmUp22 {
    public static void main(String[] args) {

        String sentence = "I love java programming language";
        String[] arr = sentence.split(" ");
        String result = "";

        for (int i = arr.length-1; i >= 0 ; i-- ) {
            result += arr[i]+ " ";
        }

        System.out.println(result);


        String sentence2 = "I love java";
        String[] arr2 = sentence2.split(" ");
        String result2 = "";


        for (int i = arr2[1].length()-1; i >= 0 ; i--) {
            result2 += arr2[1].charAt(i)+"";// love.charAt( починаючи з кінця )  бо і дорівнює останій індекс
        }

        sentence2 = sentence2.replace("love", result2);
        System.out.println(sentence2);




    }
}
