package Day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsIntro {
    //Exception - is unwanted or unexpected event.
    //To prevent exceptions from crashing the programme we must handle them.

    //Checked and Unchecked:
    //checked - that occured during writing code(compile time) -- it is easier to deal, because run will never happen until you solve exception.
    //IOException - is parent class for all checked exceptions.


    //unchecked - that are not occured during compile time(writing code). Occurs during runtime.
    //RuntimeException - is a parent class for all types of unchecked exceptions.


    public static void main(String[] args) {

        //unchecked
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        }catch (RuntimeException e){
            e.getMessage();
        }

        //For unchecked exception you dont know what exception class to handle, so its harder.
        //when exception occured it terminates the program
        System.out.println("Cant run this code");



        //checked
        System.out.println("Hello");

        try {
            Thread.sleep(2000); //red line under sleep method
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        try {
            FileInputStream file = new FileInputStream("path");
        }catch (FileNotFoundException e){
           // e.printStackTrace();//print full details of exception
            System.err.println( e.getMessage()); //print brief details of exception
        }

        System.out.println("Smth");

        //The parent exception can handle all child exception, but it is not efficient, don't use Exception and Throwable classes.
        //If you don't know name of exception - use RunTimeException

    }
}
