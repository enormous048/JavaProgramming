package Day43_Abstraction_Class.shape;

public class ShapeMain {
    public static void main(String[] args) {

        Shape shape = new Cube("Cube", 11);        //double d = 12.4;
        //shape.volume();
        System.out.println(  ( (Cube)shape ).volume()   );   // (int) d          //тут ше одні дужки через метод ().volume()



        Shape shape2 = new Sphere("Sphere", 12);   //double d = 12.4;
        //shape2.volume();

        Sphere sp = (Sphere) shape2;        //int i = (int) d;
        sp.volume();





        Shape shape3 = (Shape) new Cylinder("Cyl", 22, 43);
        //shape3.volume();

        System.out.println(   ( (Cylinder)shape3 ).volume()   );


    }
}
