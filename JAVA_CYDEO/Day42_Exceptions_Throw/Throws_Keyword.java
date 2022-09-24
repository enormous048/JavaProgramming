package Day42_Exceptions_Throw;

import java.io.FileNotFoundException;

public class Throws_Keyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        //Throws keyword is used within method declaration, deals with checked exceptions ONLY.
        //After that you don't need to call try catch, throws is the fastest way.

        //There is one disadvantage, when you call method with throws error in another method,
        //you need to handle exception again in caller method - so the best case to use throws is when method won't be called.



        //1. try&catch for handling checked and unchecked exceptions
        //2. throws for handling checked exceptions, doesn't work with unchecked exceptions.

        Thread.sleep(1500);
    }
}
