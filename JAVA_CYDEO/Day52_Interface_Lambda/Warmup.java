package Day52_Interface_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Warmup {
    public static void main(String[] args) {
        String str = "abbbbdmmmmfmmccc";
        Map<String, Integer> uniques = new LinkedHashMap<>();

        for( String s : Arrays.asList(str.split(""))){

            if (Collections.frequency(   Arrays.asList(str.split("")) , s )  == 1 ){
                uniques.put(s, 1);
            }
        }

        System.out.println("uniques = " + uniques);
    }
}
