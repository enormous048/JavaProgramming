package Day43_Abstraction_Class.shape;

public final class Square extends Shape{
    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw  new RuntimeException("Side cannot be negative");
        }
        this.side = side;
    }

    @Override
    public double area(){
        return side*side;
    }

    @Override
    public double perimeter(){
        return side*4;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
