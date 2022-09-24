package Day39_Inheritance_Encapsulation.studentTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, char gender, int age, String fieldOfStudy, String schoolName, int studentId, char grade) {
        super(name, gender, age, fieldOfStudy, schoolName, studentId, grade);
    }

    public void study(){
        System.out.println(getName()+" is studying for graduating.");
    }

}
