package Day33_StaticMembers.Day33_Task;

public class Dog {
    public String breed, size, color;
    public int gender, age;
    public static int numberOfLegs = 4,
            numberOfEyes = 2,
            numberOfWings = 0;

    public static boolean isFriendly = true;

    public Dog(String breed, String size, String color, int gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
