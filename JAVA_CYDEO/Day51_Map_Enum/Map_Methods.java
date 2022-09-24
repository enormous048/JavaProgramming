package Day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {
    public static void main(String[] args) {

        // put(key, value)  - inserts key and value into the map
        // putAll(map) - inserts another map's keys and values into map
        Map<String, Integer> map = new HashMap<>();
        map.put("Naz", 92);
        map.put("Yana", 95);

        // get( key )  - returns value
        System.out.println(map.get("Naz"));


        // size() - returns size of map
        System.out.println(map.size());


        // replace(key, value) - replace old value of key in map (if you don't want to put another pair).
        // (but put() is good if we want to add another pair)
        map.replace("Naz", 94);


        // remove( key ) - removes by key
        map.remove("Naz");


        // containsKey( key ) - return true if key is contained in map
        boolean k = map.containsKey("Naz");

        // containsValue( value ) - return true if value is contained in map
        boolean v = map.containsValue(95);


        // isEmpty() - true if size is zero
        boolean e = map.isEmpty();


        // clear() - clears the map




        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);

        // map.equals(map)  -  if all keys and values are the same, then returns true
        System.out.println(map.equals(map2));
    }
}
