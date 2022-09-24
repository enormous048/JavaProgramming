package Day39_Inheritance_Encapsulation.studentTask;

public class Student extends Person{
     private String fieldOfStudy, schoolName;
     private int studentId;
     private char grade;


    public Student(String name, char gender, int age, String fieldOfStudy, String schoolName, int studentId, char grade) {
        super(name, gender, age);
       setStudentId(studentId);
       setFieldOfStudy(fieldOfStudy);
       setSchoolName(schoolName);
       setGrade(grade);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()){
            return;
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.isEmpty()){
            return;
        }
        this.schoolName = schoolName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId<=0){
            return;
        }
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade<'A' || grade>'D'){
            System.out.println("Invalid");
            return;
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studing.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
