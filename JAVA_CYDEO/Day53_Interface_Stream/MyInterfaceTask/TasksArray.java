package Day53_Interface_Stream.MyInterfaceTask;

import java.util.Arrays;
import java.util.Collections;

public class TasksArray {
    public static void main(String[] args) {


        ArrayFunction<Integer, Integer> maxNum = (arr)->{

            return Collections.max(Arrays.asList(arr));

        };

        ArrayFunction<Integer, Integer> minNum = (arr)->{

            return Collections.min(Arrays.asList(arr));

        };

        ArrayFunction<String, String> longestStr = (arr)->{

            String longest = "";

            for (String s : arr) {
                if (s.length()>longest.length()){
                    longest = s;
                }
            }

            return longest;
        };

        ArrayFunction<String, String> shortestStr = (arr)->{

            String shortest = "";
            int length = Integer.MAX_VALUE;

            for (String s : arr) {
                if (s.length()<length){
                    length = s.length();
                    shortest = s;
                }
            }

            return shortest;
        };

        String[] array = {"Naz", "Baba", "Abdulmanap"};
        System.out.println(shortestStr.apply(array));





    }
}
