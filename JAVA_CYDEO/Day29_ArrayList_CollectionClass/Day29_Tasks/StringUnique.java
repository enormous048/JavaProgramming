package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringUnique {

    public static void main(String[] args) {
        
        String str = "java python java c# c++ c++";
        
        String[] arr = str.split(" ");

        ArrayList<String > uniqueStr = new ArrayList<>(Arrays.asList(arr)); //або можна зразу str.split(" ") запхати в констрактор

        String result = "";
        for (String s : uniqueStr) {
            if (Collections.frequency(uniqueStr, s)==1){
                result+=s + " ";
            }
        }
        System.out.println("result = " + result);
        

        
    }
}
