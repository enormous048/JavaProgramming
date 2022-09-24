package Day52_Interface_Lambda;

@FunctionalInterface
public interface MyFirstFuncInterface {
    //Earlier we used interfaces for providing additional methods to child classes and classes in inheritance.

    //Here the purpose is to create a method.
    //Here we can only have one method.
    //Implementation is given by lambda expression.


    //Instead of creating different methods that accept integer for example, we can create one method that work with int.
    void function(int n);

    // whatever body in lambda expression you give, that would be implementation of abstract method in func interface.
}
