package Day51_Map_Enum.Tasks2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Grades {
    public static void main(String[] args) {

        Map<Integer, Character> grades = new LinkedHashMap<>();
        grades.put(1,'A');
        grades.put(2,'B');
        grades.put(3,'C');
        grades.put(4,'D');
        grades.put(5,'A');
        grades.put(6,'B');
        grades.put(7,'C');
        grades.put(8,'A');
        grades.put(9,'B');
        grades.put(10,'B');

        Map<Integer, Character> excellent = new LinkedHashMap<>();
        Map<Integer, Character> great = new LinkedHashMap<>();
        Map<Integer, Character> good = new LinkedHashMap<>();
        Map<Integer, Character> poor = new LinkedHashMap<>();

        for (Map.Entry<Integer, Character> eachGrade : grades.entrySet()){
            //чому взагалі існує ентріСет() а не ентріЛист(), тому шо меп і сет обидва не приймають дуплікатів

            if (eachGrade.getValue() == 'A'){
                excellent.put(eachGrade.getKey(), eachGrade.getValue());
            }
        }
        for (Integer key : grades.keySet()){
            if (grades.get(key) == 'B'){
                great.put(key, grades.get(key));
            }
        }
        for (Map.Entry<Integer, Character> entry : grades.entrySet()){
            if (entry.getValue() == 'C'){
                good.put(entry.getKey(), entry.getValue());
            }
        }
        for (Integer key : grades.keySet()){
            if (grades.get(key) == 'D'){
                poor.put(key, grades.get(key));
            }
        }
        //якшо буду по велью лупити то ключ не зможу в меп поставити


        System.out.println("grades = " + grades);
        System.out.println("excellent = " + excellent);
        System.out.println("great = " + great);
        System.out.println("good = " + good);
        System.out.println("poor = " + poor);
    }
}
