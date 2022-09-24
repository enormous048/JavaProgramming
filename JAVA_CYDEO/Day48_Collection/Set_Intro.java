package Day48_Collection;

import java.util.*;

public class Set_Intro {

    public static void main(String[] args) {

        // Set(I):
        // *doesn't have index numbers.
        // *duplications are not  allowed.
        // *insertion order is not preserved

        //Use case of sets - is the best to remove duplicates.


        Set<Integer> set = new HashSet<>();
        //implements Set interface. Random order. Accepts null values. (the fastest of sets)


        Set<Integer> set2 = new LinkedHashSet<>();
        //extends HashSet. Maintains insertion order. Accepts null values.


        TreeSet<Integer> set3 = new TreeSet<>();
        //implements SortedSet(child interface of Set). Ascending order(12, 20, 400). Does not accept null values.






        Integer[] arr = {11,44,1,1,1,1,1,4,5,6,7,8,9,8};
        LinkedHashSet<Integer> setset = new LinkedHashSet<>(Arrays.asList(arr)); //кожен наступний дуплікат видаляє
        System.out.println(setset);

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(arr)); //removes duplicates and puts in ascending order
        System.out.println(treeSet);




    }
}
