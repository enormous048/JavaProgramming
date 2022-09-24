package Day44_Abstraction_Interface.warmup;

public final class Eagle extends Animal implements Flyable, Wild{

    public Eagle(String breed, String color, int age, char gender, String name) {
        super(breed, color, age, gender, name);
    }

    public void fly(){
        System.out.println(getName() + " flies at height of 1500 metres.");
    }
    public void wild(){
        System.out.println(getName() + " is wilding.");
    }

    public void eat(){
        System.out.println(getName() + " eats fish.");
    }
}
