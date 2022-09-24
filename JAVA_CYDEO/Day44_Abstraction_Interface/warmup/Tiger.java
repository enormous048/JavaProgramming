package Day44_Abstraction_Interface.warmup;

public final class Tiger extends Animal implements Wild{

    public Tiger(String breed, String color, int age, char gender, String name) {
        super(breed, color, age, gender, name);
    }

    public void wild(){
        System.out.println(getName() + " is wilding.");
    }

    public void eat(){
        System.out.println(getName() + " eats deer.");
    }
}
