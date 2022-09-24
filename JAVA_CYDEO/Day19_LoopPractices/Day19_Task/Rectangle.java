package Day19_LoopPractices.Day19_Task;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the wigth of the rectangle: ");
            double width = scan.nextDouble();
            if  (width <= 0) {
                System.err.println("Invalid number");
                System.exit(0);
            }
            System.out.println("Enter the length of rectangle: ");
            double length = scan.nextDouble();
            if  (length <= 0) {
                System.err.println("Invalid number");
                System.exit(0);
            }

            double area = width * length;
            double perimeter = 2 * (width + length);

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);



            System.out.println("Would you like to cintinue?");
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
