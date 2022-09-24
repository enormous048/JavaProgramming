package Day53_Interface_Stream.BiPredicateTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class Tasks {
    public static void main(String[] args) {

        BiPredicate<int[], int[]> areEqual = (arr1, arr2)->{

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);

        };

        //Create a function that can check if the first array contains all the elements of the second array
        BiPredicate<Integer[], Integer[]> containsSecond = (arr1, arr2)->{

            return new ArrayList<>(Arrays.asList(arr1)).containsAll(Arrays.asList(arr2));
        };

        Integer[] test1 = {1,2,3,4,5,6};
        Integer[] test2 = {1,2,3,9};
        System.out.println(containsSecond.test(test1,test2));


        BiPredicate<List<Integer>, List<Integer>> areEqualList = (list1, list2)->{

            Collections.sort(list1);
            Collections.sort(list2);

            return list1.equals(list2);
        };


        //Create a function that can check if the first list contains all the elements of the second list
        BiPredicate<List<Integer>, List<Integer>> containsSecondList = (list1, list2)->{

            return list1.containsAll(list2);
        };


    }
}
