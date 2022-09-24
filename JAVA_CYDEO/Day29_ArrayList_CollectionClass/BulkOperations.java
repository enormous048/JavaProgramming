package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // argument must be a collection type
        // Array.asList( values of array ) - переводить еррей в коллекшин тайп

        //addAll( collectionType ) -- adds collection of values to ArrayList
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3));




        //removeAll( collectionType ) -- removes all matching elements from arraylist
        nums.removeAll( Arrays.asList(3,4,6));

        //retainAll( collectionType ) -- removes all unmatching elements from arraylist (всі шо співпали залишаться а інші видаляться)
        nums.retainAll( Arrays.asList(3,4,6));


        //containAll( collectionType )
        boolean bool1 = nums.contains(1) && nums.contains(2) && nums.contains(3);
        boolean bool2 = nums.containsAll(Arrays.asList(1,2,3));
        //якшо я хочу перевірити чи еррейлист контейнить декілька елементів, instead of calling contains method a lot of times
        //якшо хочаби один не контейниться то фолс





    }
}
