package Day41_Exceptions;

import java.io.IOException;

public class TryCatchMulti {
    public static void main(String[] args) {

        //there is shortcut in Intellij if there is checked exception
        try{
            System.out.println(10/0);
            System.out.println("Try block"); //не запринтує текст якшо зверху стався ексепшин

        }catch(IndexOutOfBoundsException e){
            System.out.println("First try to catch");//не запринтує якшо не знайшло індексаут ексепшин, схоже на іф else стейтмент

        }catch(ArithmeticException e){
            System.out.println("Second try to catch");

        }catch (RuntimeException e){
            System.out.println("Final try to catch");//не запринтує якшо знайшло вже раніше, навіть якшо це перент

        }finally { //optional block, always gets executed no matter if exception caught or not caught
            System.out.println("Finally block");

            //To prevent finally block from execution we only can System.exit(0)
        }





        //We use multi try catch, if there can be multiple types exceptions and we want to get info of them.
        //Parent exception class cannot be placed before child class exception - so when no one exception matched we can put parent RuntimeException.

        //But if we dont want to be specific we can just use RuntimeException parent.
    }



}
