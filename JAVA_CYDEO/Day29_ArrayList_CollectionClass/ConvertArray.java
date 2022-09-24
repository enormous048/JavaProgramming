package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArray {
    public static void main(String[] args) {
        //To convert array to arraylist - array must not contain primitives

        Integer[] arr = {22,34,45,67,78};
        ArrayList<Integer> arrList = new ArrayList<>( Arrays.asList(arr) );
        //arrList.addAll(Arrays.asList(arr)); //то саме шо зверху


        int[] arr2 = {1,2,34,5,6,77};
        ArrayList<Integer> arrList2 = new ArrayList<>( PrimitiveToList.convertPrimitiveArray(arr2));
        //arrList2.addAll( PrimitiveToList.convertPrimitiveArray(arr2) );

    }
}
