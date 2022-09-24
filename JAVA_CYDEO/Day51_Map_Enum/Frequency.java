package Day51_Map_Enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {

        String str = "ddhhhhhfqkqkkkk";
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : Arrays.asList(str.split(""))){  //  s = d,d,h,h,h,h...
            map.put(s, Collections.frequency(Arrays.asList(str.split("")), s) );
        }

        //Робим коллекшин тайп із стрінга та зафіксовуєм кожну букву(елемент)
        //Ставимо в меп елемент(букву) як ключ і її частоту як значення.

        System.out.println(map);


    }
}
