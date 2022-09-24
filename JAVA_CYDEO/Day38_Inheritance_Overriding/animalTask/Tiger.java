package Day38_Inheritance_Overriding.animalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, String size, String color, char gender, int age){
        super(name, breed, size, color, gender, age);
    }

    @Override
    public void eat(){
        System.out.println(name +" " + breed + " eats deer.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
