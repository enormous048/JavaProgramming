package Day46_Polymorphism;

import Day43_Abstraction_Class.shape.Circle;
import Day43_Abstraction_Class.shape.Cube;
import Day43_Abstraction_Class.shape.Shape;
import Day43_Abstraction_Class.shape.Sphere;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle(12);

        if (shape instanceof Circle){              // true if object type of shape is Circle
            System.out.println("shape is circle");

        } else if (shape instanceof Sphere) {      // true if object type of shape is Sphere
            System.out.println("shape is sphere");
        }


        boolean isCube = shape instanceof Cube;
    }
}
