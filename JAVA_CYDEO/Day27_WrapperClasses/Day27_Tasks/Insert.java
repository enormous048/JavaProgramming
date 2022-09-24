package Day27_WrapperClasses.Day27_Tasks;

import java.util.Arrays;

public class Insert {

    public static int[] insert(int[] arr, int index, int insertion){

        int[] result = new int[arr.length+1];
        for (int i = 0, j = 0; i <= arr.length; i++, j++) { //якшо буде резулт ленз то вкінці ше 0 добавиться просто

            if (i == index){ //якшо індекс співпав то в новому ерреї на тому індексу додається новий елемент
                result[i] = insertion;
                i++; //зміщуєм індекс резулта вперед , а j лишається той самий
            }

            result[i] = arr[j];
        }
        return result;


    }

    public static void main(String[] args) {
        int[] m = {1,2,4,5,7,8};

        int[] newArr = insert(m, 2, 13);
        System.out.println(Arrays.toString(newArr));

    }
}
