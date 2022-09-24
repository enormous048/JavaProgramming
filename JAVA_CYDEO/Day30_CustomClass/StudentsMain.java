package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsMain {
    public static void main(String[] args) {

        Students studentsObj = new Students();
        studentsObj.setInfo("Naz", 5, 18, 245999349);
        
        System.out.println(studentsObj);
        

        Students studentsObj2 = new Students();
        studentsObj2.setInfo("Milfa", 4, 18, 245999349);

        Students studentsObj3 = new Students();
        studentsObj3.setInfo("Mia", 2, 18, 245999349);


        ArrayList<Students> studList = new ArrayList<>();
        studList.addAll(Arrays.asList(studentsObj, studentsObj2, studentsObj3));

        ArrayList<Students> earlyBirds = new ArrayList<>();
        ArrayList<Students> lateBirds = new ArrayList<>();

        for (Students student : studList) {
            if (student.grade == 5){
                earlyBirds.add(student);
            } else {
                lateBirds.add(student);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds.size());
        System.out.println("lateBirds.size()  = " + lateBirds.size() );
    }
}
