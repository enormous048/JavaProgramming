package Day39_Inheritance_Encapsulation;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public Circle( double radius){
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
       return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
