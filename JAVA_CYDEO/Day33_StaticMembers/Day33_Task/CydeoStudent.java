package Day33_StaticMembers.Day33_Task;

public class CydeoStudent {

    public String name;
    public int age, id, grade, batchNumber, groupNumber;
    public char gender;
    public static String schoolName = "CydeoSchool",
             programmingLanguage = "Java";




    public CydeoStudent(String name, int age, int id, int grade, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public static void printSchName(){
        System.out.println("Students' school name: " + schoolName);
    }
    public static void printProgramLang(){
        System.out.println("Students' programming language: " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}
