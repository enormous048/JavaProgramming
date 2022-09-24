package Day51_Map_Enum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfMaps {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "SDET");
        map.put(2, "Developer");
        map.put(3, "Developer");
        map.put(4, "P0");
        map.put(5, "SM");

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Abdulhamid", 100000);
        map2.put("Nikita",130000);
        map2.put("Line",110000);
        map2.put("Mert", 90000);
        map2.put("Lee", 50000);

        Map<   Map<Integer, String>,  Map<String, Integer>   >  mapOfMaps = new LinkedHashMap<>();
        mapOfMaps.put(map, map2);


        for ( Map.Entry< Map<Integer, String>, Map<String, Integer> >   eachMapInside  : mapOfMaps.entrySet()   ){
            //в аутер мепі існує тільки одне ключ велью ентрі, тому той луп що нижче все правильно запринтує

            for (Map.Entry<Integer, String> entryInKeyMap : eachMapInside.getKey().entrySet()) { //вибиває меп1 бо він ключ

                System.out.println(entryInKeyMap.getValue()); //принтуєм кожен джобТайтл з меп1

            }

            for (Map.Entry<String , Integer>  entryInValueMap : eachMapInside.getValue().entrySet()) {

                System.out.println(entryInValueMap.getKey());  //витягаєм імена(key)  з меп2 котрий є велью в аутермепі
            }
        }


        //  id  jobTitle  -  name salary
        //  по суті кожен елемент на уявному індексі в першому мепі корелює з кожним уявним індексом в другому мепі


        int salary = mapOfMaps.get(map2).get("Nikita");  //витягаєм зарплату микити
    }
}
