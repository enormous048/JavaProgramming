package Day39_Inheritance_Encapsulation.animalTask;

public class Animal {

    private String name, breed, size, color;
    private int age;
    private char gender;

    public Animal(String name, String breed, String size, String color, int age, char gender) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()|| name==null){
            System.err.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isBlank()|| breed==null){
            System.err.println("Invalid breed");
            return;
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.isBlank()|| size==null){
            System.err.println("Invalid size");
            return;
        }
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()|| color==null){
            System.err.println("Invalid color");
            return;
        }
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
