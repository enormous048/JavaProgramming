package Day36_Inheritance_Intro;

public class WarmUp36 {
    private String name;
    private int age;
    private char gender, grade;
    public static String schoolName;


    public WarmUp36(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    static {
        schoolName = "Cydeo School";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F'){       // AND - обидва мають бути правильними шоб було тру
            System.out.println("Invalid gender");// OR  - якшо один хотяби правильний то тру
        }
        this.gender = gender;
    }
    public void setGrade(char grade) {
        if (grade <'A' || grade >'F'){
            System.out.println("Invalid grade");
            return;
        }
        this.grade = grade;
    }

    public String toString() {
        return "WarmUp36{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
