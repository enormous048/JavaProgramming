package Day44_Abstraction_Interface.warmup;

public final class Bear extends Animal implements Wild, Swimmable{

    public Bear(String breed, String color, int age, char gender, String name) {
        super(breed, color, age, gender, name);
    }

    public void wild(){
        System.out.println(getName() + " is wilding.");
    }

    public void swim() {
        System.out.println(getName() + " is good at short swim");
    }

    public void eat(){
        System.out.println(getName()+" eats honey.");
    }
}
