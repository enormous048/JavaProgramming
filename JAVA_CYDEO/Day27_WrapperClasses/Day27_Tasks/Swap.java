package Day27_WrapperClasses.Day27_Tasks;

import java.util.Arrays;

public class Swap {

    public static int[] swap(int[] arr, int index1, int index2){

        int[] result = new int[arr.length];

        int[] temporal = arr;
        for (int i = 0; i <= arr.length-1 ; i++) {
            result[i] = arr[i]; //копіюєм еррей
            if (i == index1) {
                result[index1] = arr[index2]; //якшо співпало то елемент міняється
            }

            if (i == index2){
                result[index2] = temporal[index1]; //якшо співпало то елемент міняється
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,23,4,5,5,67,8};

        int neww[] = swap(arr, 1, arr.length-2);
        System.out.println(Arrays.toString(neww));
    }
}
