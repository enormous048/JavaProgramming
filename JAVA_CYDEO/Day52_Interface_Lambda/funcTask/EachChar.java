package Day52_Interface_Lambda.funcTask;

import java.util.ArrayList;
import java.util.Arrays;


public class EachChar {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> printEachChar = (str) -> {
            for (int i = 0; i<= str.length()-1; i++){
                System.out.println(str.charAt(i));
            }

        };
        printEachChar.data("Naz Kovalchuk");
        //(str) це саме шо імя параметра в методі ти туда будеш запихати інфу




        MyThirdFunctionalInterface<String[]> printEachElement = (array) -> {
            //datatype який задано в <>   буде дататипом параметру (str)

            for (String s : array) {
                System.out.println(s);
            }
        };

        String[] arr = {"Naz", "Baz", "Fuz", "Kamaz", "Vaz"};
        printEachElement.data(arr);




        MyThirdFunctionalInterface< ArrayList<String> > printEachElementList = (arrList) -> {

            for(String eachStr : arrList){
                System.out.println(eachStr);
            }
        };

        ArrayList<String> list = new ArrayList<>(Arrays.asList("random", "random", "random"));
        printEachElementList.data(list);



    }
}
