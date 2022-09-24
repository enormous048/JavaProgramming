package Day39_Inheritance_Encapsulation;

public class Square extends Shape{

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
            return;
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName() +
                ", side=" + side +    //or getSide()  тут можна бо це той самий клас
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
