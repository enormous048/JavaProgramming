package Day26_CustomMethod_Practice;

import utilities.ArrayUtility;

public class RemoveElement2_0 {

    public static String[] removeElement(String[] arr, int index ){
        String[] result = new String[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }

    public static int[] removeElement(int[] arr, int index ){
        int[] result = new int[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }

    public static char[] removeElement(char[] arr, int index ){
        char[] result = new char[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }

    public static double[] removeElement(double[] arr, int index ){
        double[] result = new double[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }



    public static int[] removeElement2_0(int[] arr, int index ){
        int[] result = new int[arr.length-1];

        for (int i = 0; i <= result.length-1; i++) {
            if (i != index){
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }

        }
        return result;
    }

    public static int[] removeElement3_0(int[] arr, int index ){
        int[] result = new int[arr.length-1];

        int j = 0;
        for (int i = 0; i <= result.length-1; i++) {
            if (i == index){
                continue;
            }

            result[j] = arr[i];
            j++;

        }
        return result;
    }


}
