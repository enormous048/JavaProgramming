package CodeStuff;

import java.util.Scanner;

public class Discriminant2_0 {
    public static void main(String[] args) {
        /*Use Integer.parseInt() to Convert a String to an Integer. This method returns the string as a primitive type int.

        String num = "123";

        int realNum = Integer.parseInt(num);
        System.out.println( realNum + 1);
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter square equation: ");
        String equation = scan.nextLine().toLowerCase();

        equation = equation.trim();
        equation = equation.replace(" ", "");


        String subStringA = equation.substring(0, equation.indexOf("x"));
        String subStringB = equation.substring(equation.indexOf("x") + 2, equation.lastIndexOf("x"));
        String subStringC = equation.substring(equation.lastIndexOf("x") + 1, equation.indexOf("="));

        double a1 = 0;
        double b1 = 0;
        double c1 = 0;

        boolean allTrue = (subStringA.equals("") || subStringB.equals("+") || subStringA.equals("-")) && (subStringB.equals("") || subStringB.equals("+") || subStringB.equals("-"));
        boolean aTrue = (subStringA.equals("") || subStringA.equals("+") || subStringA.equals("-"));
        boolean bTrue = (subStringB.equals("") || subStringB.equals("+") || subStringB.equals("-"));

        try {
            a1 = Integer.parseInt(subStringA, 10);
            b1 = Integer.parseInt(subStringB, 10);
            c1 = Integer.parseInt(subStringC, 10);

        } catch (Exception E) {

            if (allTrue) {
                if (subStringA.equals("") || subStringB.equals("+")) {
                    a1 = 1;
                } else if (subStringA.equals("-")) {
                    a1 = -1;
                } else if (subStringB.equals("") || subStringB.equals("+")) {
                    b1 = 1;
                } else if (subStringB.equals("-")) {
                    b1 = -1;
                }
                c1 = Integer.parseInt(subStringC, 10);


            } else if (aTrue && !allTrue && !bTrue) {

                if (subStringA.equals("") || subStringB.equals("+")) {
                    a1 = 1;
                } else if (subStringA.equals("-")) {
                    a1 = -1;
                }

                b1 = Integer.parseInt(subStringB, 10);
                c1 = Integer.parseInt(subStringC, 10);


            } else if (bTrue && !allTrue && !aTrue) {

                if (subStringB.equals("") || subStringB.equals("+")) {
                    b1 = 1;
                } else if (subStringB.equals("-")) {
                    b1 = -1;
                }

                a1 = Integer.parseInt(subStringA, 10);
                c1 = Integer.parseInt(subStringC, 10);

            }
        }


            double d = 0;
            d = Math.pow(b1, 2) - 4 * a1 * c1;  //Math.pow(число, степінь)

            if (d == 0) {
                double x = -b1 / (2 * a1);
                System.out.println("The equation has one root " + x);

            } else if (d < 0) {
                System.out.println("It's not gonna work");

            } else {
                double x1 = (-b1 + Math.sqrt(d)) / 2 * a1;  //sqrt корінь квадратний вертає
                double x2 = (-b1 - Math.sqrt(d)) / 2 * a1;

                System.out.println("Discriminant = " + d + "\nx1 = " + x1 + "\nx2 = " + x2);
            }

    }
}
