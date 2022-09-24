package Day43_Abstraction_Class.shape;

public final class Circle extends Shape{

    private double radius;
    public static final double pi = 3.14;


    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("Radius can not be negative");
        }
        this.radius = radius;
    }

    public double area(){
        return pi * (radius * radius);
    }
    public double perimeter(){
        return 2 * pi * radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
