package Day36_Inheritance_Intro.animal;

public class Fish extends Animal{


    public Fish(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }

    //сприймай це так ніби тут створені всі методи які є в перент класі.
    public void swim(){
        System.out.println(name +" is swimming.");
    }
}
