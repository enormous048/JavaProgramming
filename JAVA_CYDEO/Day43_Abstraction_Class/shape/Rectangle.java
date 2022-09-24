package Day43_Abstraction_Class.shape;

public final class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw  new RuntimeException("Width cannot be negative");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (width<=0){
            throw  new RuntimeException("Length cannot be negative");
        }
        this.length = length;
    }

    @Override
    public double area(){
        return width*length;
    }
    @Override
    public double perimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
