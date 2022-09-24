package Day24_CustomMethod_Return.Day24_Task;

import java.util.Arrays;

public class Task5 {

    public static int[] addNumToArr(int[] arr, int num){
        int[] result = new int[arr.length+1];

        int index = 0;
        for (int i : arr) {
            result[index] = i;
            index++;
        }
        result[index] = num;

        return result;

    }

    public static void main(String[] args) {
        int[] begin = {1,23,5,7};
        int num = 69;

        int[] newArr = addNumToArr(begin, num);
        System.out.println(Arrays.toString(newArr));
    }
}
