package Day53_Interface_Stream.InterfaceTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_Interface {
    public static void main(String[] args) {

        //Function - takes one argument and returns a value.
        //Плюс в тому шо ти можеш різні давати дженеріки, параметр може бути стрінг, а ретурн тайп інтежер.

        // R apply(T t);     Function<T, R>  - значить параметр стоїть першим, потім ретурн тайп


        Function<int[], List<Integer>>  convertToList = (arr) ->{
            List<Integer> result = new ArrayList<>();
            for (int i : arr){
                result.add(i);
            }

            return result;
        };

        int[] array = {1,2,3,4,56,7,8,9,0};
        List<Integer> listConverted = convertToList.apply(array);
        System.out.println(listConverted);




        //--------------------------------------------------------
        Function<List<Integer>, int[]>  convertToArr = (list) ->{
            int[] result = new int[list.size()];
            for (int i=0; i <= list.size()-1; i++){
                result[i] = list.get(i);
            }

            return result;
        };

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,45,6,78,0));
        int[] array2 = convertToArr.apply(list2);
        System.out.println(array2);


    }
}
