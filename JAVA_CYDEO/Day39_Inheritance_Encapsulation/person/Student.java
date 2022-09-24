package Day39_Inheritance_Encapsulation.person;

public class Student extends Person{

    private String schoolName;

    public Student(String name, int age, char gender, String schoolName) {
        super(name, age, gender);
        setSchoolName(schoolName);
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
