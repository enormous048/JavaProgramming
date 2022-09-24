package Day53_Interface_Stream;

import java.util.*;

public class Warmup {
    public static void main(String[] args) {


        Map<String, Integer> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", 2);
        scrumTeam1.put("Nikita",3);
        scrumTeam1.put("Line",8);
        scrumTeam1.put("Mert", 9);
        scrumTeam1.put("Lee", 7);

        Map<String, Integer> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", 6);
        scrumTeam2.put("Muhammed", 7);
        scrumTeam2.put("Гулистан", 4);
        scrumTeam2.put("Ahmad", 4);
        scrumTeam2.put("Nevin", 5);
        scrumTeam2.put("Атакан", 6);

        Map<String, Integer> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", 6);
        scrumTeam3.put("This", 7);
        scrumTeam3.put("Urantuya", 5);
        scrumTeam3.put("Veronica", 8);
        scrumTeam3.put("Alex", 11);
        scrumTeam3.put("Абдулазиз", 3);

        List< Map< String, Integer> > listOfMaps = new ArrayList<>(Arrays.asList(scrumTeam1, scrumTeam2, scrumTeam3));

        for (Map<String, Integer> team : listOfMaps){

            for(Map.Entry<String, Integer> entry : team.entrySet()){
                System.out.println(entry.getKey()+ "  " + entry.getValue());
            }

        }

        for (Map<String, Integer> team : listOfMaps){

            for(Map.Entry<String, Integer> entry : team.entrySet()){
                if (entry.getValue()>7){
                    System.out.println(entry.getKey());
                }
            }
        }

        for (Map<String, Integer> team : listOfMaps){

            for(Map.Entry<String, Integer> entry : team.entrySet()){
                if (entry.getValue()<7){
                    System.out.println(entry.getKey());
                }
            }
        }

        String name = "";
        int maxHours = Integer.MIN_VALUE;

        String namemin = "";
        int minHours = Integer.MAX_VALUE;
        for (Map<String, Integer> team : listOfMaps){

            for (Map.Entry<String, Integer> entry : team.entrySet()){  //читай то як фор іч пейр

                if(entry.getValue()>maxHours){
                    maxHours = entry.getValue();
                    name = entry.getKey();
                }
                if (minHours> entry.getValue()){
                    minHours= entry.getValue();
                    namemin = entry.getKey();
                }
            }
        }
        System.out.println("minHours = " + minHours);
        System.out.println("maxHours = " + maxHours);



    }
}
