package Day38_Inheritance_Overriding.shapeTask;

public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double area(){
        return width*length;
    }
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
