package Day20_Array.Day20_Task;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversed = new int[5];

        for (int i = array.length-1, j = 0; i >=0 && j <= array.length-1; i--, j++) { //треба луп робити з двома веріблами бо по іншому складно
            reversed[j] = array[i];
        }

        System.out.println(Arrays.toString(reversed));




    }
}
