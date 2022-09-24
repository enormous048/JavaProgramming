package Day21_Utility_ForEach.Day21_Task;

import java.util.Arrays;

public class Descend {
    public static void main(String[] args) {

        int[] arr = {8, 5, 4, 5, 9};
        int[] arr2 = new int[arr.length];
        Arrays.sort(arr);

        for ( int i = arr.length-1, j = 0; i>=0 && j <= arr.length-1; i--, j++){ //в експрешин не обовязково шось вказувати бо і то і то одинаково по розміру
            arr2[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));

        for (int i : arr) {
            if (i % 2 == 0){
                System.out.println(i+" " + "even");
            }else {
                System.out.println(i + " " + " odd");
            }

        }


    }
}
