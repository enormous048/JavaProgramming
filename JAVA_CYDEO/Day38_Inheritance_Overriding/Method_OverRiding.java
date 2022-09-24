package Day38_Inheritance_Overriding;

public class Method_OverRiding {
    //Giving different implementations to the method; One method having multiple different implementations
    //Less memory usage cause there is only 1 method.


    //•Must happen in the sub class
    //•Return type, method name and parameters of the overridden method must be same
    //•Access modifier of the overridden method needs to be same or more visible
    //•We can not override methods with private access modifier, or with static & final specifiers
    //•Only the instance methods (not private & not final) can be overridden


    //Method Overloading : Any methods can be overloaded
    //                     Can happen everyWhere

    //Method OverRiding  : Only instance methods nor private nor final nor static methods.
    //                     Only happen in subclass



    //So when subclass method may have different implementation, then you should use method overriding.
}
