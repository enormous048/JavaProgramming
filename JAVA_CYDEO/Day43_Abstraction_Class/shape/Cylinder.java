package Day43_Abstraction_Class.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double heigth;
    private final double pi = 3.14;

    public Cylinder(String name, double radius, double heigth) {
        super(name);
        setRadius(radius);
        setHeigth(heigth);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double area() {
        return 2*pi*radius*heigth+2*pi*(radius*radius);
    }

    @Override
    public double perimeter() {
        return 4*radius + 2*heigth;
    }

    public double volume(){
        return pi*(radius*radius)*heigth;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", heigth=" + heigth +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", volume=" + volume() +
                '}';
    }
}
