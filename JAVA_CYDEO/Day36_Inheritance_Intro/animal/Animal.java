package Day36_Inheritance_Intro.animal;

public class Animal {
    //Тепер всі ці методи і філди можуть юзати і сабкласи

    protected String name, breed, color;
    protected char gender;
    protected int size, age;


    protected Animal(String name, String breed, String color, char gender, int size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    protected void eat(){
        System.out.println(name + " is eating.");
    }
    protected void dring(){
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
