package Day31_CustomClass_Constructors;

public class Rectangle {
    public int length, width;

    public double area(){

        return length*width;
    }
    public double perimeter(){

        return 2*(length+width);
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter()+
                '}';
    }
}
