package Day35_OOP_Encapsulation.Day35_Task;

public class Rectangle {
    private double width;
    private double length;



    public double calcArea(){
        return width*length;
    }
    public double calcPer(){
        return 2*(width+length);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return  length;
    }

    public void setWidth(double width){
        if (width <= 0){
            System.out.println("Invaid width "+ width);
            return;
        }
        this.width = width;
    }
    public void setLength(double length){
        if (length <= 0){
            System.out.println("Invalid length " + length);
            return;
        }
        this.length = length;
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPer() +
                '}';
    }
}
