package Day42_Exceptions_Throw;

import Day19_LoopPractices.Day19_Task.Rectangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Keyword {

    //Throw is used to create exception -- when you need to manually create an exception.

    //Instead of exiting program we can create exception - it is more readable to user.


    //Throws : only handles checked exceptions;
    //Throw  : can only create unchecked exception;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age<=0){
            throw new InputMismatchException("Input cannot be negative");
            //Input mismatch also has exit() method, and now its more understandable
        }else if (age>=120){
            throw new InputMismatchException("Input cannot be more then 120");//you can put exception message.
        }

        //throw new Rectangle("fff"); //not working if Class is not in Throwable class.
        //Doesn't work with checked exceptions, ONLY unchecked.


        if (age>=18){
            System.out.println("You are eligible to buy alcohol.");
        }


    }
}
