package Day43_Abstraction_Class.shape;

public class Sphere extends Shape implements Volume{

    private double radius;
    private final double pi = 3.14;

    public Sphere(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double area() {
        return 4* pi*(radius*radius);
    }

    @Override
    public double perimeter() { //perimeter of sphere is called Circumference
        return 2*pi*radius;
    }

    public double volume(){
        return (4/3)*pi*(radius*radius*radius);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", volume=" + volume() +
                '}';
    }
}
