package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7,7,6,3,3,4,45,45,5,5));

        ArrayList<Integer> result = new ArrayList<>();


        for (Integer i : list) {
            if (Collections.frequency(list, i) == 1){
                result.add(i);
            }
        }
        System.out.println("result = " + result);

        //OR

        ArrayList<Integer> unique = new ArrayList<>(list);
        unique.removeIf( p -> Collections.frequency(unique, p) > 1);
        System.out.println("Unique - " + unique);

    }
}
