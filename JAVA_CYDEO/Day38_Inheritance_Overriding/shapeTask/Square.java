package Day38_Inheritance_Overriding.shapeTask;

public class Square extends Shape{

    public int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public double area(){
        return side*side;
    }
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
