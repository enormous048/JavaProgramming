package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NLargest {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,23,3,4,5,56,6));

        ArrayList<Integer> result = new ArrayList<>();

        /*for (int j = 0; j <= arrList.size()-1; j++) {
            Integer max = 0;
            for (Integer i : arrList) {

                if (max < i) {
                    max = i;
                }
            }
            result.add(max);
            arrList.remove(max);
            j--;//зменшуєм j бо щоразу еррСайз зменшується на 1 і якраз вийде потрібна кількість ітерацій
        }*/
        //OR
        /*for (int i = 0; i <= arrList.size()-1; i++) {
            result.add(Collections.max(arrList));
            arrList.remove(Collections.max(arrList));
            i--;
        }*/
        //OR
        int n = 2;
        for (int i = 1; i < n; i++) {
            arrList.removeIf( p -> p == Collections.max(arrList));
        }
        System.out.println(n + " largest number - "+ Collections.max(arrList) );


        /*
        int n = 2;
        int nlargest = result.get(n-1);
        System.out.println("nlargest = " + nlargest);*/







    }
}
