package Day51_Map_Enum.Tasks2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Multiply {
    public static void main(String[] args) {

        Map<Integer, Integer> salaries = new LinkedHashMap<>();
        salaries.put(1, 100000);
        salaries.put(2, 170000);
        salaries.put(3, 120000);
        salaries.put(4, 100000);
        salaries.put(5, 80000);
        salaries.put(6, 90000);
        salaries.put(7, 110000);
        salaries.put(8, 150000);

        for (Integer key : salaries.keySet()){
            if (salaries.get(key) >= 110000){
                salaries.replace(key, salaries.get(key)-10000);
            }
        }

        for( Map.Entry<Integer, Integer> entry : salaries.entrySet()){
            if (entry.getValue()<= 100000){
                entry.setValue(entry.getValue()+10000 );
            }
        }

        ArrayList<Integer> salariesBiggerThan100k = new ArrayList<>();
        for( Map.Entry<Integer, Integer> entry : salaries.entrySet() ){

            if (entry.getValue() > 100000)
            salariesBiggerThan100k.add(entry.getValue());
        }
        System.out.println("Number of salaries bigger than 100k = " + salariesBiggerThan100k.size());


    }
}
