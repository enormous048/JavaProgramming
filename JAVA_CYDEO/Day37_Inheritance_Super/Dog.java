package Day37_Inheritance_Super;

public class Dog extends Animal{

    public String propertyOf;

    public Dog(String name, String breed, String color, char gender, int size, int age, String propertyOf){
        super(name, breed, color, gender, size, age);
        this.propertyOf = propertyOf;
    }

    //Here toString method will print Animal{ name=..}   , we need to override it to make different implementation

    @Override
    public String toString() {
        return "Dog{" +
                "propertyOf='" + propertyOf + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
