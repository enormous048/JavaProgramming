package Day36_Inheritance_Intro.Day36_Task_Planet;

public class Planet {
   public String name, strengthOfGravity;
   public int mass, radius, population, surfaceArea;

    public Planet(String name, String strengthOfGravity, int mass, int radius, int population, int surfaceArea) {
        this.name = name;
        this.strengthOfGravity = strengthOfGravity;
        this.mass = mass;
        this.radius = radius;
        this.population = population;
        this.surfaceArea = surfaceArea;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", strengthOfGravity='" + strengthOfGravity + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", population=" + population +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}
