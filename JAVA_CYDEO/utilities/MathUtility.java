package utilities;

import java.util.Arrays;

public class MathUtility {

    //return the max number from given array
    public static int maxNumber(int[] arr){
        int result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];
        
        return result;
        
    }

    public static long maxNumber(long[] arr){
        long result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];

        return result;

    }

    public static double maxNumber(double[] arr){
        double result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];

        return result;

    }

    public static float maxNumber(float[] arr){
        float result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];

        return result;

    }

    public static byte maxNumber(byte[] arr){
        byte result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];

        return result;

    }

    public static short maxNumber(short[] arr){
        short result = 0;

        Arrays.sort(arr);
        result = arr[arr.length-1];

        return result;

    }



    //return min number from given array
    public static int minNumber(int[] arr){
        int result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }

    public static long minNumber(long[] arr){
        long result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }

    public static double minNumber(double[] arr){
        double result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }

    public static float minNumber(float[] arr){
        float result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }

    public static byte minNumber(byte[] arr){
        byte result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }

    public static short minNumber(short[] arr){
        short result = 0;

        Arrays.sort(arr);
        result = arr[0];

        return result;

    }




    //return sum between two given numbers
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2){
        return num1+num2;
    }

    //return substraction between two given numbers
    public static int substact(int num1, int num2){
        return num1-num2;
    }
    public static double substract(double num1, double num2){
        return num1-num2;
    }

    //return multiplication between two given numbers
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }


    //return division between two given numbers
    public static int divide(int num1, int num2){
        return num1/num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }


    //returns true if given number is even/odd
    public static boolean isEven(int num){
        return num%2==0;
    }
    //returns true if given number is odd
    public static boolean isOdd(int num){
        return num%2!=0;
    }


    //return square of given number
    public static int square(int num){
        return num*num;
    }
    public static double square(double num){
        return num*num;
    }


    //return cube of given number
    public static int cube(int num){
        return num*num*num;
    }
    public static double cube(double num){
        return num*num*num;
    }


    //return result of number in given degree
    public static int customDegree(int num, int degree){

        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= num;
        }

        return result;
    }
    public static double customDegree(double num, int degree){

        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= num;
        }

        return result;
    }


    //returns max number of two given numbers
    public static int maxOfTwo(int first, int last){

        int max = 0;
        if (first > last){
            max = first;
        }else {
            max = last;
        }
        return max;

    }
    public static double maxOfTwo(double first, double last){

        double max = 0;
        if (first > last){
            max = first;
        }else {
            max = last;
        }
        return max;

    }


    //returns min number of two given numbers
    public static int minOfTwo(int first, int last){

        int min = 0;
        if (first < last){
            min = first;
        }else {
            min = last;
        }
        return min;

    }
    public static double minOfTwo(double first, double last){

        double min = 0;
        if (first < last){
            min = first;
        }else {
            min = last;
        }
        return min;

    }

    public static void sleep(double second){ //замість того щоб весь час писати трай кетч можна визвати цей метод де вже що разу трай кетч автоматично
        try {
            Thread.sleep((long)(second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
