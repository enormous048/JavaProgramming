package Day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {

    public static char[] addAfterLast(char[] arr, char ch){

        char[] result = new char[arr.length + 1];

        int index = 0;
        for (char c : arr) {
            result[index] = c;
            index++;
        }
        result[index] = ch;

        return result;


    }

    //Виділи певну порцію коду, зажми кнтрл + R  і там можна буде замінити будь що. Наприклад чар на стрінг

    public static String[] addAfterLast(String[] arr, String str){
        String[] result = new String[arr.length + 1];

        int index = 0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            result[i] = arr[i];
            index++;
        }
        result[index] = str;

        return result;
    }

    //Method overloading - means the methods can have the same name as long as the number or(and) type of parameters are different

    //main method can also be overloaded

    // Overloading makes method reusable, for example sort() is overloaded because it can accept string array or int or double

    public static void main(String[] args) {

        char[] arr = {'a', 'v', 'd'};
        char ch = 'n';

        char[] newArray = addAfterLast(arr, ch);
        System.out.println(Arrays.toString(newArray));


        String[] arr2 = {"matt", "die", "strange"};
        String str = "naz";

        String[] newStrArray = addAfterLast(arr2, str);
        System.out.println(Arrays.toString(newStrArray));



    }
}
