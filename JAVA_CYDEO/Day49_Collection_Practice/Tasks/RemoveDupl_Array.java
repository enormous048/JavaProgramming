package Day49_Collection_Practice.Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDupl_Array {
    public static void main(String[] args) {

        Character[] arr = {'m', 'd', 'd', 'm', 'e', 'y', 'y','t'};

        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new Character[0]);
        System.out.println(arr[3]);



        Double[] arr2 = {12.0,44.4,55.2,66.6,77.3,88.4, 133.8};

        // asList переводить в колекшин тайп
        arr2 = new TreeSet<>(Arrays.asList(arr2)).toArray(new Double[0]);
        System.out.println( arr2[arr2.length-1] );  //max num



        Float[] arr3 = {12f,3f,4f,5f,6f,8f,9f,9f,9f,9f,99f};

               //створюється обьєкт сету  і       переводиться в ерей знову
        arr3 = new TreeSet<>(Arrays.asList(arr3)).toArray(new Float[0]);
        System.out.println(arr3[0]);  //min num

    }
}
