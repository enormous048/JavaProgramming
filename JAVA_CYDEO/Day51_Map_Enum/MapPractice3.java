package Day51_Map_Enum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPractice3 {
    public static void main(String[] args) {

        //put() - put elements in Map

        java.util.Map<Integer, String> map = new HashMap<>();
        map.put(42, "Hitchhiker's quide to the Galaxy");
        map.put(69, "Sex");  //can only put one by one (putAll - you can add whole map to another map)
        map.put(69, "book"); //if there is same key, the last key will be accepted and first removed

        map.put(null, "book2");
        map.put(null, "book3"); //last null key will be accepted

        map.put(12, null);
        map.put(13, null); //but accepts multiple null values

        System.out.println(map);



        java.util.Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(42, "Hitchhiker's quide to the Galaxy");
        map2.put(69, "Sex");
        map2.put(69, "book");

        map2.put(null, "book2");
        map2.put(null, "book3");

        map2.put(12, null);
        map2.put(13, null);

        System.out.println(map2);


        //Tree map sorts by key and not by value.
        java.util.Map<Integer, String> map3 = new TreeMap<>();
        map3.put(69, "book");
        map3.put(42, "Hitchhiker's quide to the Galaxy");


        System.out.println(map3);

    }
}
