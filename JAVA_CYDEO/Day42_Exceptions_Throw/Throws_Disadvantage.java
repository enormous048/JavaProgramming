package Day42_Exceptions_Throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Disadvantage {

    public static void method1() throws FileNotFoundException {
        new FileInputStream("path");
    }
    public static void method2() {
       // method1();   //getting exception
    }


    public static void method11(){
        try {
            new FileInputStream("path");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void method22(){
        method11();// not getting exception
    }
}
