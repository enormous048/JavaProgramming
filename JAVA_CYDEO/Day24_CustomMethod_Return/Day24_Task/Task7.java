package Day24_CustomMethod_Return.Day24_Task;

import java.util.Arrays;

public class Task7 {

    public static int[] removeFromArr(int[] arr, int index){
        int[] result = new int[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){ //якшо j == індекс то посувається на одну поділку таким чином то  шо була в ерреї під індексом j пропуститься
                j++;
            }
            result[i] = arr[j];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,69};
        int indexRemove = 2;

        int[] newArray = removeFromArr(arr, indexRemove);
        System.out.println(Arrays.toString(newArray));

    }
}
