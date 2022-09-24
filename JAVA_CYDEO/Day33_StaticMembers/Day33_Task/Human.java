package Day33_StaticMembers.Day33_Task;

public class Human {
    public String name;
    public int age;
    public char gender;

    public static boolean isHuman, hasNose= true,
            hasWings = false;
    public static int numberOfHead = 1,
            numberOfEyes = 2;


    public Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void hasWings(){
        System.out.println("Does humans have wings? " + hasWings);
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
