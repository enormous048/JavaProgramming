package Day27_WrapperClasses;

import java.awt.*;
import java.util.Arrays;

public class WarmUp27 {


    //replaces element from given index with given newValue
    public static int[] replaceElement(int[] arr, int index, int newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }

        arr[index] = newValue;
        return arr;

    }

    public static char[] replaceElement(char[] arr, int index, char newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }

    public static String[] replaceElement(String[] arr, int index, String newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }

    public static double[] replaceElement(double[] arr, int index, double newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }



    //replaces all matching given oldValue from given array with newValue
    public static int[] replaceAll(int[] arr, int oldValue, int newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static double[] replaceAll(double[] arr, double oldValue, double newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static String[] replaceAll(String[] arr, String oldValue, String newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static char[] replaceAll(char[] arr, char oldValue, char newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    
    
    
    
    
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,56,6};
        int[] newArr = replaceAll(arr, 2, 4);
        System.out.println(Arrays.toString(newArr));


    }
}
