package Day53_Interface_Stream.InterfaceTheory;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicate_Interface {
    public static void main(String[] args) {

        //Takes two arguments that can be any type each and returns boolean.
        //boolean test(T t, U u);

        BiPredicate<int[], Integer> isCOntained = (arr, num)->{

            for(int i = 0; i<=arr.length-1; i++){
                if (arr[i] == num){
                    return true;
                }
            }
            return false;
        };

        BiPredicate<String, String> areAnagram = (str1, str2) ->{

            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)){
                return true;
            }
            return false;

            //or
            //return Arrays.equals(arr1, arr2);

        };

        boolean b = areAnagram.test("oll", "lo");
        System.out.println("b = " + b);


        //якшо тобі потрібен мтод який працює з двома аргументами і ретурнить булін то звертає до предікет
    }
}
