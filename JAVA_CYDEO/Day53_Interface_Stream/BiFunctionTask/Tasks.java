package Day53_Interface_Stream.BiFunctionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Tasks {

    public static void main(String[] args) {


        BiFunction<String , String , String> commonChars = (str1, str2)->{
            String result = "";
            for (String s : str1.split("")) {
                if (str2.contains(s)){
                    result+=s;
                }
            }
            return result;
        };


        //6.2 Create a function that can return the common elements of two integer arrays
        BiFunction<Integer[], Integer[], Integer[]> commonElementsInArr = (arr1, arr2)->{
            ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i <=arr2.length-1; i++) {
                if ( new ArrayList<>(Arrays.asList(arr1)).contains(arr2[i]) ){  //можна було двома лупами порівняти ерреї, але так легше
                    result.add(arr2[i]);
                }
            }
            return result.toArray(new Integer[0]);

        };
        Integer[] first = {1,2,3,4,6,7,8,9};
        Integer[] second = {3,4,5,6};
        Integer[] test = commonElementsInArr.apply(first, second);
        System.out.println("test = " + Arrays.toString(test));

        

        BiFunction<String[], String[], String[]> commonElementsStArr = (arr1, arr2)->{
            ArrayList<String> result = new ArrayList<>();

            for (int i = 0; i <=arr2.length-1; i++) {
                if ( new ArrayList<>(Arrays.asList(arr1)).contains(arr2[i]) ){  //можна було двома лупами порівняти ерреї, але так легше
                    result.add(arr2[i]);
                }
            }
            return result.toArray(new String[0]);

        };
        
        
        BiFunction<List<Integer>, List<Integer>, List<Integer>> commonOfInList = (list1, list2) ->{
            
            List<Integer> result = new ArrayList<>();
            for (Integer i : list2) {
                if (list1.contains(i)){
                    result.add(i);
                }
            }
            return result;
        };

        BiFunction<List<String>, List<String>, List<String>> commonOfStList = (list1, list2) ->{

            List<String> result = new ArrayList<>();
            for (String i : list2) {
                if (list1.contains(i)){
                    result.add(i);
                }
            }
            return result;
        };



    }
}
