package Day45_Abstraction_Interface2;

public interface Interface {

    char gender = 'M';          // static final by default
    void abstractMethod();      // public abstract by default


    //якшо лише деякі обьєкти роблять цю дію:
    //Later on the child class default method will be treated as instance methods because child will own all methods and fields
    public default void drinkCoca(){
        System.out.println("this animal drinks coca cola"); //default specifier method (won't be using)
    }

    public static void staticMethod(){ //possible to give static methods(static methods works only with static fields)
        System.out.println("Gender is " + gender);
        //can call static method with interface name
    }



    //impossible to give instance methods/variables, static blocks, constructors.


}
