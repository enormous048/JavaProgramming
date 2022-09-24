package Day38_Inheritance_Overriding;

public class Tesla extends Car {

    public Tesla( String model, String color, int year, int price, int miles) {
        super("Tesla", model, color, year, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand +" "+ model + " autopilot has started.");
    }

    @Override  //this annotation helps to check if method is overriden, if its green than its overriden, but its not mandatory annotation
    public void start(){
        System.out.println(brand + " "+ model +" started with the Lion battery turn on.");
    }


    //There is java.lang.Object class in java where there are all methods that all objects need (toString, equals..)
    //When we call equals  there is only one equals method in Object class, and we just override it, so memory is saved.

    //Object class is the parent of all the classes, it is implicitly extended.
}
