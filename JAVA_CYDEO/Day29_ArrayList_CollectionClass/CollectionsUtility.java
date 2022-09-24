package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        //Arrays - utility class of array
        //Collections - utility class of collection

        //so despite ArrayList methods we have Collection methods that are applyable to all collection types:


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7,6,3,4,45,5));

        Collections.sort(list); //will be sorted in ascending order
        System.out.println("list = " + list);

        Collections.reverse(list);// will be reversed
        System.out.println("list = " + list);

        Collections.swap(list, 0, list.size()-1);
        System.out.println("list = " + list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        Collections.replaceAll(list, 7, 77); //all matching old values will be changed to new value

        int frequency = Collections.frequency(list, 4);






    }
}
