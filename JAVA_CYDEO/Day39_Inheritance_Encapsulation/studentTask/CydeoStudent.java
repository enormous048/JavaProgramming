package Day39_Inheritance_Encapsulation.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, char gender, int age, String fieldOfStudy, String schoolName, int studentId, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, fieldOfStudy, schoolName, studentId, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            return;
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            return;
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty()){
            return;
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void study(){
        System.out.println(getName() + " is studying java and selenium.");
    }
    public void eat(){
        System.out.println(getName() + " is eating with java");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", studentId=" + getStudentId() +
                ", grade=" + getGrade() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
