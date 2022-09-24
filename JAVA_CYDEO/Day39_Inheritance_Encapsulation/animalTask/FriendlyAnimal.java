package Day39_Inheritance_Encapsulation.animalTask;

public class FriendlyAnimal extends Animal{

    private boolean isWild,
            isFriendly,
            isPlayable;


    public FriendlyAnimal(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }
}
