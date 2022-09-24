package Day35_OOP_Encapsulation.Day35_Task;

public class Square {
    private double side;



    public double calcArea(){
        return side*side;
    }
    public double calcPer(){
        return 4*side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        if (side<=0){
            System.out.println("Invalid side");
            return;
        }
        this.side = side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPer() +
                '}';
    }
}
