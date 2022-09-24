package Day52_Interface_Lambda;

// lambda:  () -> {}

public class TestFunc {
    public static void main(String[] args) {

        // function1: create a function that can display if a number is odd.

        // if you want to perform that function later, you should assign it to FuncInterface variable.
        MyFirstFuncInterface isOddEven = (number)  -> {
            if (number%2 == 0){
                System.out.println(number+ " is even");
            }else {
                System.out.println(number+ " is odd");
            }

        };
        //If the abstract method in your functional interface demands some parameter,
        //you can't leave the braces in lambda empty, you need to provide there some name.

        isOddEven.function(10);
        isOddEven.function(59);



        // function2: create a function that can check if the person is eligible to buy alcohol
        MyFirstFuncInterface isEligible = (age) -> {
            if (age>= 18){
                System.out.println("Is eligible");
            }
        };
        isEligible.function(19);
        isEligible.function(12);//the name decides which body of abstract method will be executed



        // function3: create a function that can display the cube of a number
        MyFirstFuncInterface printCube = (number) -> {
            System.out.println(number*number*number);
        };
        printCube.function(3);

        //if abstract method accepts only one parameter, then these parentheses are optional  (name) - name
        //if none parameters or more than one you must give parentheses.







        //These are 3 different function but method is only one, and its not like override,
        //because here you can use them at the same time.

        //if I were to create custom methods for these tasks I would create 3 method - consumes more memory.
        //with functional interface we have just one method and provide implementation in lambda expression.
    }
}
