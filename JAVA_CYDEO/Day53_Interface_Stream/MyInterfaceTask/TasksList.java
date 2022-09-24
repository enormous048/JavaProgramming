package Day53_Interface_Stream.MyInterfaceTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TasksList {
    public static void main(String[] args) {

        ListFunction<Integer, Integer> maxNum = (list)->{

            return Collections.max(list);

        };
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(maxNum.apply(l));

        ListFunction<Integer, Integer> minNum = (list)->{

            return Collections.min(list);

        };

        ListFunction<String, String> longestString = (list)->{

            String longest = "";
            for (String s : list) {
                if (s.length()>longest.length()){
                    longest = s;
                }
            }

            return longest;

        };

        ListFunction<String, String> shortestString = (list)->{

            String shortest = "";
            int length = Integer.MAX_VALUE;
            for (String s : list) {
                if (s.length()<length){
                    length = s.length();
                    shortest = s;
                }
            }

            return shortest;

        };


        ListFunction<Integer, int[]> convertIntList = (list) ->{

            int[] result = new int[list.size()];

            for ( int i = 0; i<= result.length-1; i++) {
                result[i] = list.get(i);
            }
            return result;

        };

        ListFunction<Double, double[]> convertDoubleList = (list) ->{

            double[] result = new double[list.size()];

            for ( int i = 0; i<= result.length-1; i++) {
                result[i] = list.get(i);
            }
            return result;

        };




    }
}
