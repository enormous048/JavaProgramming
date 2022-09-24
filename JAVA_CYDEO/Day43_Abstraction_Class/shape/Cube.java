package Day43_Abstraction_Class.shape;

public final class Cube extends Shape implements Volume{

    private double side;

    public Cube(String name, double side) {
        super(name);
        setSide(side);
    }


    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6*(side*side);
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    public double volume(){
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", volume=" + volume() +
                '}';
    }
}
