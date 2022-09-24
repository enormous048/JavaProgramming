package Day35_OOP_Encapsulation;

public class WarmUp {
    public String name;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasWings;


    public WarmUp(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static {
        planet = "Earth";
        isHuman = true;
        hasWings = false;
    }

    public String toString() {
        return "WarmUp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
