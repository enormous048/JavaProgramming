package Day40_Protected_Final;

public class Animal {
    private final String name;
    private final String breed;
    private final String color;

    private final char gender;

    private int age;
    private int lbs;


    //setter doesnt work with final variable
    public Animal(String name, String breed, String color, char gender, int age, int lbs) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        setAge(age);
        setLbs(lbs);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getLbs() {
        return lbs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLbs(int lbs) {
        this.lbs = lbs;
    }

    public void eat(){
        System.out.println(name + " eats food.");
    }

    public final void drink(){
        System.out.println(name + " drinks water.");
    }
}
