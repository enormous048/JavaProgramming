package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;

public class PrimitiveToList {

    public static ArrayList<Integer> convertPrimitiveArray( int[] arr){

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++) {
            result.add(arr[i]);
        }
        //по одному примітиви конвертяться у врепери, але коли їх багато вони не можуть стати вреперами за раз хіба по одному

        return result;
    }
}
