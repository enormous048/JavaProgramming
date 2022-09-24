package Day21_Utility_ForEach.Day21_Task;

import java.util.Arrays;

public class Merge2 {
    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] result = new int[arr1.length+ arr2.length+ arr3.length];

        int index = 0;
        for (int i : arr1){
            result[index] = i;
            index++;
        }

        for (int i : arr2){
            result[index] = i;
            index++;
        }

        for (int i : arr3){
            result[index] = i;
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}
