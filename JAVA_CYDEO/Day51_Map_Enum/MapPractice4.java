package Day51_Map_Enum;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {

        String[] group1 = {"Naz", "Marichka", "Htc"};
        String[] group2 = {"Hulya", "Anrew", "Rostyk"};
        String[] group3 = {"Pukin", "Bob", "Cirzan"};
        String[] group4 = {"Anor", "Emir", "Salem"};
        String[] group5 = {"Mahmud", "Muhtar", "Aras"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);


        System.out.println(Arrays.toString(groups.get(2)));

        System.out.println(groups.get(3)[1].charAt(0)); //витягуєм першу букву другого стрінга з еррею під ключем три


        for (Map.Entry<Integer, String[]> group : groups.entrySet()) { //зафіксовуєм елемент мепу

            for (String student : group.getValue()) { //витягуєм по одному стрінгу з зафіксованого еррею
                System.out.println(student);
            }

        }


    }
}
