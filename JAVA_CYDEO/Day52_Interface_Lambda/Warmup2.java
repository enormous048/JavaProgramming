package Day52_Interface_Lambda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Warmup2 {
    public static void main(String[] args) {

        /*
        Create a data structure to store these maps.
        1. print the names(keys)  of all testers.
        2. print the names of all developers.
        */

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


        ArrayList< Map<String, String> >  listOfMap  = new ArrayList<>();
        listOfMap.add(scrumTeam1);
        listOfMap.add(scrumTeam2);
        listOfMap.add(scrumTeam3);


        //benefit is that you dont need to create 5 loops to iterate 5 maps, just put in list and 2 loops is enough

        for ( Map<String, String> teams : listOfMap ){

            for ( String key : teams.keySet() ){

                if(teams.get(key).equalsIgnoreCase("sdet")){  //prints testers
                    System.out.println(key);
                }
            }
        }

        for (Map<String, String> teams : listOfMap){

            for ( Map.Entry<String, String> employee : teams.entrySet() ){


                if (employee.getValue().equalsIgnoreCase("developer")){
                    System.out.println(employee.getKey());
                }
            }
        }
    }
}
