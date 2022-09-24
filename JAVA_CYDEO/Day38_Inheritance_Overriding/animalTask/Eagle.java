package Day38_Inheritance_Overriding.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String breed, String size, String color, char gender, int age){
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat(){
        System.out.println(name + " " + breed + " eats snake.");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
