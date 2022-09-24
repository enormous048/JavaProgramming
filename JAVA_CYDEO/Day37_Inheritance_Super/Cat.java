package Day37_Inheritance_Super;

public class Cat extends Animal{

    public Cat(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void scratch(){
        System.out.println(name + " is scratching.");
    }

    //Here toString method will print Animal{ name=..}   , we need to override it to make different implementation

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
