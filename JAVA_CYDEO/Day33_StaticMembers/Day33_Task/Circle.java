package Day33_StaticMembers.Day33_Task;

public class Circle {

    public int radius, diameter;
    public static double pi = 3.14;


    public Circle(int radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }

    public double calcArea(){
        return pi * radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi * radius;
    }

    public static void printPi(){
        System.out.println("Pi = " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius =" + radius +
                ", diameter =" + diameter +
                ", area =" + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}
