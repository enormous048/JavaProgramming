package Day39_Inheritance_Encapsulation;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width");
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length<=0){
            System.err.println("Invalid length");
            return;
        }
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
