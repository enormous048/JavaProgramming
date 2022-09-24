package Day44_Abstraction_Interface.warmup;

public final class Snake extends Animal implements Wild, Swimmable{

    public Snake(String breed, String color, int age, char gender, String name) {
        super(breed, color, age, gender, name);
    }

    public void wild(){
        System.out.println(getName() + " is wilding.");
    }

    public void swim() {
        System.out.println(getName() + " is good at long swim");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats rats.");
    }
}
