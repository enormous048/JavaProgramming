package CodeStuff;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
 /*       System.out.println("Enter \"a\" variable of square equation: ");
        double a = scan.nextDouble();

        System.out.println("Enter \"b\" variable of square equation: ");
        double b = scan.nextDouble();

        System.out.println("Enter \"c\" variable of square equation: ");
        double c = scan.nextDouble();
*/

        System.out.println("Enter square equation like in example: EX. 4x2 + 5x - 1 = 0");
        String equation = scan.nextLine();

        //4x2 + 5x - 1 = 0
        char a = equation.charAt(equation.length()-16);
        char b = equation.charAt(equation.length()-10);
        char c = equation.charAt(equation.length()-5);


        //Це можна ше легше зробити щоб не тратити сили на спейси зробити trim(), and replace() так леше буде
        if (a == 49) {
            a1 = 1;

        }else if (a == 50){
            a1 = 2;

        }else if (a == 51){
            a1 = 3;

        }else if (a == 52){
            a1 = 4;

        }else if (a == 53){
            a1 = 5;

        }else if (a == 54){
            a1 = 6;

        }else if (a == 55){
            a1 = 7;

        }else if (a == 56){
            a1 = 8;

        }else if (a == 57){
            a1 = 9;

        }else if (a == 32){
            a1 = 1;

        } else {
            System.out.println("Invalid number");
            scan.close();
        }


        if (b == 49) {
            b1 = 1;

        }else if (b == 50){
            b1 = 2;

        }else if (b == 51){
            b1 = 3;

        }else if (b == 52){
            b1 = 4;

        }else if (b == 53){
            b1 = 5;

        }else if (b == 54){
            b1 = 6;

        }else if (b == 55){
            b1 = 7;

        }else if (b == 56){
            b1 = 8;

        }else if (b == 57){
            b1 = 9;

        }else if (b == 32){
            b1 = 1;

        } else {
            System.out.println("Invalid number");
            scan.close();
        }



        if (c == 49) {
            c1 = 1;

        }else if (c == 50){
            c1 = 2;

        }else if (c == 51){
            c1 = 3;

        }else if (c == 52){
            c1 = 4;

        }else if (c == 53){
            c1 = 5;

        }else if (c == 54){
            c1 = 6;

        }else if (c == 55){
            c1 = 7;

        }else if (c == 56){
            c1 = 8;

        }else if (c == 57){
            c1 = 9;

        }else if (c == 32){
            c1 = 1;

        }else {
            System.out.println("Invalid number");
            scan.close();
        }




        double d = 0;
        d = Math.pow(b1, 2) - 4*a1*c1;  //Math.pow(число, степінь)

        if (d == 0){
            int x = -b1 / (2 * a1);
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
