package Day54_StringFormat;

import java.math.*;

public class JavaMathExamples {
    public static void main(String[] args) {
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045


        //  pow( число , степінь )
        System.out.println(Math.pow(2, 3)); // 8.0


        System.out.println(Math.exp(1)); // 2.718281828459045
        System.out.println(Math.log10(10)); // 1.0

        System.out.println(Math.sqrt(64)); // 8.0
        System.out.println(Math.cbrt(64)); // 4.0

        System.out.println("abs"+Math.abs(-20)); // 20  abs вертає позитивне в любому випадку.
        System.out.println("abs"+Math.abs(20)); //  20  abs вертає позитивне в любому випадку.


        System.out.println(Math.max(10, -20)); // 10
        System.out.println(Math.min(10, -20)); // -20
    }
}
