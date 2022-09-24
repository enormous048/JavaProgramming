package Day52_Interface_Lambda.mapTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class largestArr {
    public static void main(String[] args) {

        String[] arr = {"java", "java", "python", "ruby", "ruby", "ruby", "swift"};

        Map<String, Integer> result = new LinkedHashMap<>();

        for( String str : arr ){

            result.put(str, Collections.frequency(Arrays.asList(arr), str )   );

        }


        String largest = "";
        int max = 0;

        for ( Map.Entry<String, Integer>  entry : result.entrySet() ){

            if (max < entry.getValue()){
                max = entry.getValue();
                largest = entry.getKey();
            }
        }
        System.out.println();
        System.out.printf("String %s has the highest frequency.", largest);



    }
}
