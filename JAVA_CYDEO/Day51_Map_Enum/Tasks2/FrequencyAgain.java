package Day51_Map_Enum.Tasks2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyAgain {
    public static void main(String[] args) {

        String str = "aasdfffjjjjjccc";
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String s : Arrays.asList(str.split(""))){
            result.put( s, Collections.frequency(  Arrays.asList(str.split("")),   s)   );
        }


    }
}
