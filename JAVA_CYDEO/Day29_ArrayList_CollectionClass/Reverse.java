package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,6,9};
        Integer[] result = new Integer[arr.length];

        for (int i = args.length-1, j = 0; i >= 0; i--,j++) {
            result[j] = arr[i];
        }



        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,23,4,56,6,7,8,9));

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = arrList.size()-1; i >= 0; i--) {
            reversed.add(arrList.get(i));
        }


    }
}
