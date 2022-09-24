package Day53_Interface_Stream.FunctionTask;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Task {
    public static void main(String[] args) {

        Function<String, Integer> sumOfDigits = (str) -> {

            Integer result = 0;
            for (String s : str.split("")) {
                try {
                    result += Integer.valueOf(s);

                } catch (RuntimeException e) {
                }
            }
            return result;
        };

        System.out.println(sumOfDigits.apply("bbd2b3b4b5"));


        Function<Set<Integer>, List<Integer>> setToList = (set) -> {

            return new ArrayList<Integer>(set);
        };

        Function<Set<String>, List<String>> setToListS = (set) -> {

            return new ArrayList<String>(set);
        };

        Function<Integer[], Integer[]> reverse = (arr) -> {

            Integer[] result = new Integer[arr.length];
            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = arr[i];
            }

            return result;
        };

        Function<String[], String[]> reverseS = (arr) -> {
            String[] result = new String[arr.length - 1];

            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = arr[i];
            }

            return result;
        };

        Function<Integer[], Integer[]> sort = (arr)->{
            Arrays.sort(arr);

            return reverse.apply(arr);
        };

        Function<String[], String[]> sortS = (arr)->{
            Arrays.sort(arr);

            return reverseS.apply(arr);
        };

        Integer[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sort.apply(array)));

    }
}
