package Day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Naz", "M");
        employeeMap.put("Li", "M");
        employeeMap.put("Mia", "F");
        employeeMap.put("Aleksandra", "F");
        employeeMap.put("Kira", "F");
        employeeMap.put("Bob", "M");
        employeeMap.put("Emir", "M");

        for (String key : employeeMap.keySet()) {
            String eachValue = employeeMap.get(key);

            if (eachValue.equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            } else if (eachValue.equalsIgnoreCase("f")) {
                employeeMap.replace(key, "Female");
            }
        }

        for (Map.Entry<String, String>  entry: employeeMap.entrySet()){
            String eachValue = entry.getValue();

            if (eachValue.equalsIgnoreCase("m")){
                employeeMap.put(entry.getKey(), "Male");
            } else if (eachValue.equalsIgnoreCase("f")) {
                employeeMap.put(entry.getKey(), "Female");
            }

        }


        for(Map.Entry<String, String> entry : employeeMap.entrySet()){
            if (entry.getValue().equalsIgnoreCase("female")){
                System.out.println(entry.getKey() );
            }
        }



    }
}
