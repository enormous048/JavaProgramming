package CodeStuff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodeWarsTask {
    public static void main(String[] args) {
        /*
        You will be given an array of numbers.
        You have to sort the odd numbers in ascending order while
        leaving the even numbers at their original positions.

            Examples
            [7, 1]  =>  [1, 7]
            [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
        */



        int[]array = {12,3,6,2,4,1,6,4,5,3};
        System.out.println(Arrays.toString(array));

        //getting all odd numbers from int[] array and adding them to List
        List<Integer> oddList = Arrays.stream(array).boxed().filter(p-> p%2!=0).collect(Collectors.toList());

        //sorting list
        Collections.sort(oddList);

        //for each odd number in array
        for (int i = 0; i<array.length; i++){
            if (array[i] %2 != 0){

                //replace this odd number with first odd number in list
                array[i] = oddList.get(0);
                //remove first odd number from list
                oddList.remove(0);
            }
        }


        System.out.println(Arrays.toString(array));






    }
}
