package Day52_Interface_Lambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class Warmup3 {
    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Line","Developer");
        scrumTeam1.put("Mert", "P0");
        scrumTeam1.put("Lee", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Гулистан", "Developer");
        scrumTeam2.put("Ahmad", "P0");
        scrumTeam2.put("Nevin", "SM");
        scrumTeam2.put("Атакан", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("This", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Абдулазиз", "Developer");


        Map<String, String >[] arr = new Map[5];
        arr[0] = scrumTeam1;
        arr[1] = scrumTeam2;
        arr[3] = scrumTeam3;

        for (Map<String, String> map : arr) {

            for (Map.Entry<String, String> pair : map.entrySet()){

                if(pair.getValue().equalsIgnoreCase("developer")){
                    System.out.println(pair.getKey());
                }

            }

        }
    }
}
