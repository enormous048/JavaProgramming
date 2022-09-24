package Day53_Interface_Stream.lunchTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Function_Task {
    public static void main(String[] args) {

        Function<Integer[], Integer>  maxNum = (arr) ->{
            return Collections.max(Arrays.asList(arr));

        };

        Integer[] first = {123,4,5,6667,7777,98};
        System.out.println(maxNum.apply(first));



        Function<int[], int[]> swap = (arr)->{

            int[] result = arr;
            int firstIndex = arr[0];
            int lastIndex = arr[arr.length-1];

            result[0] = lastIndex;
            result[result.length-1] = firstIndex;

            return result;
        };

        int[] test = {11,2,3,4,5,6,77};
        test = swap.apply(test);
        System.out.println(Arrays.toString(test));


        Function<String[], String[]> reverseArr = (arr) ->{

            String[] result = new String[arr.length];

            for(int i = arr.length-1, j = 0; i>=0; i--, j++){
                result[j] = arr[i];
            }

            return result;
        };

        Function<List<String>, List<String>> reverseList = (list) ->{

            Collections.reverse(list);  //ніде не треба есайнити бо цей метод колекції просто реверсить і войдом є
            return list;
        };
    }
}
