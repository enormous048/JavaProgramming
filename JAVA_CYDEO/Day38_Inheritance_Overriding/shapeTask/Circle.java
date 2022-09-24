package Day38_Inheritance_Overriding.shapeTask;

public class Circle extends Shape{

    public int radius;
    public static double pi = 3.14;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
