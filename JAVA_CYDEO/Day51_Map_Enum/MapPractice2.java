package Day51_Map_Enum;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {


        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Naz", 140000);
        salaries.put("Li", 100000);
        salaries.put("Mia", 90000);
        salaries.put("Aleksandra", 160000);
        salaries.put("Kira", 75000);
        salaries.put("Bob", 135000);
        salaries.put("Emir", 117000);


        //Who has the min/max salary?

        int max = Collections.max(salaries.values());

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> entry : salaries.entrySet()){
            int eachSalary = entry.getValue();

            if (max2<eachSalary){
                max2 = eachSalary;
            } else if (min2>eachSalary) {
                min2 = eachSalary;
            }
        }

        //How many employees have salary between 120 - 150?
        int countSalary = 0;
        for(Map.Entry<String, Integer> entry : salaries.entrySet()){
            if (entry.getValue() >= 120000 && entry.getValue()<=150000){
                countSalary++;
            }
        }
        System.out.println(countSalary);


        //Who are making less than 118k?
        for(Map.Entry<String,Integer> entry : salaries.entrySet()){
            if (entry.getValue() < 118000){
                System.out.println(entry.getKey());
            }
        }


        System.out.println(salaries);
        for (Map.Entry<String, Integer> entry : salaries.entrySet()){

            if (entry.getValue() <= 120000) {
                //salaries.replace(entry.getKey(), entry.getValue() + 10000);
                //OR
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println(salaries);



    }
}
