package Day51_Map_Enum;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Map_Methods2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Naz", 92);
        map.put("Yana", 83);
        map.put("Anna", 76);
        map.put("Lol", 93);
        map.put("Key", 92);


        // keySet() - returns all keys as a Set of Elements    (allows to iterate map by keys)
        Set<String> keys = map.keySet();

        for (String key : keys) {
            //System.out.println(key + " " + map.get(key));
            map.replace(key, map.get(key)+5);  //реплейсим на пять більше.
        }



        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> lateBirds = new HashMap<>();

        for(String eachKey : map.keySet()){
            if (map.get(eachKey)>=90){
                earlyBirds.put(eachKey, map.get(eachKey));
            }else {
                lateBirds.put(eachKey, map.get(eachKey));
            }
        }




        // values() - returns all values from map as a Collection  (allows to iterate map by values)
        Collection<Integer> c = map.values();
        System.out.println(c);

        //OR

        ArrayList<Integer> list = new ArrayList<>( map.values() );


        System.out.println( Collections.max(map.values()) );
        System.out.println( Collections.min(map.values()) );


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer i : map.values()){  //якшо ніяких дій з ключаи не треба робити, то можна вельюс брати
            if(max<i){
                max = i;
            }
            else if(min>i){
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);

        int moreThan90 = 0;
        for(Integer i : map.values()){   //через keySet() можна таку саму фігню робити
            if (i >=90){
                moreThan90++;
            }
        }
        System.out.println(moreThan90);



        // entrySet()  - returns entry(key value) (allows to iterate map by pair - pair is called entry )
        //      entry.getKey()
        //      entry.getValue()
        //      entry.setValue()

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
