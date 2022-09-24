package Day36_Inheritance_Intro.Day36_Task_Planet;

public class Mars extends Planet{
    public boolean hasPoluses;

    public Mars(String name, String strengthOfGravity, int mass, int radius, int population, int surfaceArea, boolean hasPoluses) {
        super(name, strengthOfGravity, mass, radius, population, surfaceArea);
        this.hasPoluses = hasPoluses;
    }

}
