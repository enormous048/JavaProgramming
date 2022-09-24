package Day47_Polymorphism2;

import Day37_Inheritance_Super.Dog;
import Day43_Abstraction_Class.shape.Circle;
import Day43_Abstraction_Class.shape.Shape;
import Day44_Abstraction_Interface.warmup.Animal;
import Day44_Abstraction_Interface.warmup.Eagle;
import Day44_Abstraction_Interface.warmup.Snake;

public class ReferenceCasting {


    public static void main(String[] args) {

        //primitive type casting:
        //                        -implicit - smaller to larger  double1 = integ1
        //                        -explicit - larger to smaller  integ1  = (int) double1



        //reference type casting: There must be inheritance (you can't cast Car to Employee)

        //                        -upcasting   - smaller to larger done implicitly, Animal animal = new Cat();
        //                        -downcasting - larger type to smaller type, VVVвнизуVVV



        Shape shape = (Shape) new Circle(33); //upcasting done implicitly


        Animal animal = new Snake("UFO", "White", 3, 'M', "sneke");

        Snake snake = (Snake) animal; //downcasting with variable
        //animal.wild();
        snake.wild();


        ( (Snake)animal ).wild();    //downcasting without variable

        ( (Eagle)animal ).wild(); //вибє помилку бо ми намагаємось енімал з обджект тайпом змії, закастити в орла -- а між змією і орлом нема IS A

        //обджект тайп в кастингу, має бути таким самим як і обджект тайп тої веріабл енімал

    }
}
