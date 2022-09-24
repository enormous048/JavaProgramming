package Day53_Interface_Stream.InterfaceTheory;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunction_Interface {
    public static void main(String[] args) {

        //Similar to Function but there are 2 parameters.

        // R apply(T t, U u);
        // В параметр лябди запихають тільки Т і U а вертаєм вже веріабл резулту



        BiFunction<Integer, Integer, Integer> maxOfTwo = (firstNum, secondNum)->{

            Integer result = (firstNum>secondNum)? firstNum : secondNum;
            return result;
        };


        //merge two arrays into list
        BiFunction<Integer[], Integer[], ArrayList<Integer>> merge = (arr1, arr2)->{

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(arr1));
            list.addAll(Arrays.asList(arr2));

            return list;
        };


        Integer[] array = {12,3,4,5,6,7,8};
        Integer[] array2 = {1,2,3,5,6,7,8,88};

        ArrayList<Integer> list = merge.apply(array,array2);
        System.out.println(list);


        //------------------------------------------------------

        //Create a function that takes list of names and list of grades and returns map with names as keys and grades as values



        BiFunction< List<String>, List<Integer>, Map<String, Integer> > mapOfGrades = (listN, listG) ->{
            if (listN.size()!=listG.size()){
                throw new RuntimeException("Sizes of lists cannot be different");
            }

            Map<String,Integer> result = new HashMap<>();

            for (int i = 0; i<= listN.size()-1; i++){
                result.put( listN.get(i), listG.get(i) );
            }
            return result;
        };



        List<String> names = new ArrayList<>(Arrays.asList("Naz", "Spoon", "Bob", "Smash"));
        List<Integer> grades = new ArrayList<>(Arrays.asList(96,77,88,65));


        Map<String , Integer> test = mapOfGrades.apply(names, grades);
        System.out.println(test);

    }

}
