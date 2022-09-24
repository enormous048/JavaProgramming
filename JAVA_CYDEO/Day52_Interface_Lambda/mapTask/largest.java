package Day52_Interface_Lambda.mapTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class largest {
    public static void main(String[] args) {
        String str = "ddddhhhhhcccccnnss";

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String s : Arrays.asList(str.split(""))){
            result.put(  s, Collections.frequency( Arrays.asList(str.split("")), s )  );
        }


        String highest = "";
        int max = 0;
        for ( String key : result.keySet() ){

            if (max<result.get(key)){
                max = result.get(key);
                highest = key;
            }

        }
        System.out.println();
        System.out.printf("Character %s has the largest frequency.",highest );





    }
}
