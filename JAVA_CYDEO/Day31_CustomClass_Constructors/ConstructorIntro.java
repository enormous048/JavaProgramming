package Day31_CustomClass_Constructors;

public class ConstructorIntro {
    public static void main(String[] args) {

        //regular method :(method name can be any name)
        //access modifier   specifier   return type   methodName(parameters){}

        //constructor :(method name must match class name)
        //access modifier  methodName(parameters){}


        //Constructor is being executed when object is created.
        //If we don't define constructor by ourselves, the default constructor without parameters will be created.
        //When we want to initialise field then we should create parametrised constructor.


        //With setInfo() method we need to call it every time object is created to initialise fields.
        //But with constructor we can initialise fields   new Dog( here ).  So it is better version of setInfo method.
    }

}
