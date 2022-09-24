package Day20_Array.Day20_Task;

import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 50};
        char [] grades = new char[names.length];

        for (int i = 0; i <= names.length-1; i++) {

            if (scores[i] > 60) {
                grades[i] = 'T';
            }
            if (scores[i] < 60){
                grades[i] = 'F';
            }
        }
        System.out.println(Arrays.toString(grades));
    }
}
