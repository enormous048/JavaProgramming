package Day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Tasks {


    public static double[] merge(double[] arr, double[] arr2){

        double[] result =new double[arr.length+ arr2.length];

        int index = 0;
        for (double v : arr) {
            result[index] = v;
            index++;
        }
        for (double v : arr2) {
            result[index] = v;
            index++;
        }
        return result;

    }

    public static long max(long[] arr){

        long result = arr[0];
        for (long l : arr) {
            if (result < l){
                result = l;
            }
        }
        return result;

    }

    public static float[] reverse(float[] arr){
        float[] result = new float[arr.length];

        for (int i = arr.length-1, j = 0; i >= 0 ; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }



    public static void main(String[] args) {
        long[] arr = {12L, 222L, 345L};
        long newNum = max(arr);
        System.out.println(newNum);


        float[] arr2 = { 123.8f, 355.9f, 5666.6f};
        float[] reversed = reverse(arr2);
        System.out.println(Arrays.toString(reversed));

    }
}
