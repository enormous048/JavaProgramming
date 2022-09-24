package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        for (Integer i : scores) {
            if (i >= 0 && i <= 100) {
                if (i >= 90 && i <= 100) {
                    gradeOfA.add(i);
                } else if (i >= 80) {
                    gradeOfB.add(i);
                } else if (i >= 70) {
                    gradeOfC.add(i);
                } else if (i >= 60) {
                    gradeOfD.add(i);
                } else {
                    gradeOfF.add(i);
                }
            }else {
                continue;
            }
        }

        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());


    }
}
