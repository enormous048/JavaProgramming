package Day19_LoopPractices.Day19_Task;

import java.util.Scanner;

public class Square2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the side of the square: ");
            double side = scan.nextDouble();
            while (side <= 0) {
                System.err.println("Invalid number");
                System.exit(0);
            }

            double area = side * side;
            double perimeter = side * 4;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);



            System.out.println("Would you like to continue?");
            String cont = scan.next();

            if (cont.equals("no")) {
                System.out.println("Thanks for using our calculator");
                break;
            }
            if (cont.equals("yes")){
                continue;
            }
            while (!cont.equals("no") || !cont.equals("yes")){
                System.out.println("Please reenter");
                cont = scan.next();
            }
        }
    }
}