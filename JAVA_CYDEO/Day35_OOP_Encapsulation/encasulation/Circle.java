package Day35_OOP_Encapsulation.encasulation;

public class Circle {
    private double radius;
    public static double pi;



    public double calcArea(){
        return pi *radius*radius;
    }
    public double calcPer(){
        return 2*pi * radius;
    }


    public Circle(double radius) {
        setRadius(radius);
    }
    static{
        pi = 3.14;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius <= 0){
            System.out.println("Invalid radius");
            return;
        }
        this.radius = radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPer() +
                '}';
    }
}
