package Day39_Inheritance_Encapsulation.animalTask;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println(getName() + " is killing deer.");
    }
}
