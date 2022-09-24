package Day36_Inheritance_Intro.Day36_Task_Planet;

public class Earth extends Planet{
    public boolean hasCountries;

    public Earth(String name, String strengthOfGravity, int mass, int radius, int population, int surfaceArea, boolean hasCountries) {
        super(name, strengthOfGravity, mass, radius, population, surfaceArea);
        this.hasCountries = hasCountries;
    }
}
