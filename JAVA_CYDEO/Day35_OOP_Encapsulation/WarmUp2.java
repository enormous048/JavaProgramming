package Day35_OOP_Encapsulation;

public class WarmUp2 {
    String name;
    char gender;
    int age;
    static String schoolName;
    static String fieldOfStudy;
    static String programmingLang;

    public WarmUp2(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    static{
        schoolName = "Cydeo";
        fieldOfStudy = "Automation";
        programmingLang = "Java";
    }

    public String toString() {
        return "WarmUp2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
