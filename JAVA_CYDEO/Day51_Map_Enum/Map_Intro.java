package Day51_Map_Enum;

import java.util.*;

public class Map_Intro {
    public static void main(String[] args) {
        //Map - has its own methods, it doesn't implement Collection :

        //*collection of pairs(key - value)
        //*only supports non primitives.
        //*size can be increased and decreased.
        //*keys cannot be duplicated and values can.


        //HashMap (C) : Random order(like hashset). Accepts null.
        Map<Integer, String> map = new HashMap<>();


        //LinkedHashMap (C) : Maintains insertion order. Accepts null.
        Map<Integer, String> map2 = new LinkedHashMap<>();



        //HashTable (C) : Random order. Synchronized. Doesn't allow any null key and value.
        Map<Integer, String> map3 = new Hashtable<>();



        //TreeMap (C) implements SortedMap(I) : Ascending order. Doesn't allow null key, but allows null value.
        Map<Integer, String> map4 = new TreeMap<>();


    }
}
