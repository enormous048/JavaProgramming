package Day39_Inheritance_Encapsulation.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.err.println(getName() + " is scratching");
    }
}
