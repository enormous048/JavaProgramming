package Day51_Map_Enum.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Naz", "Andrew", "Stefan", "Oleg", "Roman", "Yarik"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Marushka", "Marichka", "Yana", "Durda", "Bulda", "Tanya"));


        Map<String, ArrayList<String>> university = new HashMap<>();
        university.put("A11B", group1);
        university.put("A12B", group2);


        String name1 = university.get("A11B").get(5); //витягаєм 6 елемент з першої групи(еррейлиста)
        String name2 = university.get("A12B").get(2);

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);


        int studentCount = 1;
        for( ArrayList<String> eachGroup : university.values()  ){  //зафіксовуєм еррейлист стрінгів з мепу


            for (String student : eachGroup){  //зафіксовуєм кожен стрінг з попередньо-зафіксованого еррею

                System.out.println();
                System.out.printf(" Student %d - " + student, studentCount); //принтуєм кожного стюдента
                studentCount++;
            }
        }





    }
}
