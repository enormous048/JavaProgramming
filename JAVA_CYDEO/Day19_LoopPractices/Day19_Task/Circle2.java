package Day19_LoopPractices.Day19_Task;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the radius of the circle: ");
            double radius = scan.nextDouble();
            while (radius <= 0) {
                System.err.println("Invalid number");
                System.exit(0);
            }

            double diameter = radius + radius;
            double area = radius * radius * 3.14; // 3 * 3 * 3.14  for example
            double perimeter = 2 * radius * 3.14; // 2 * 3 * 3.14  this is not the same as upper

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);


            System.out.println("Would you like to calculate another circle?");
            String cont = scan.next();
            if (cont.equals("yes")){
                continue;
            }
            if (cont.equals("no")){
                System.out.println("Thank you for your time.");
                break;
            }

            while ( !cont.equals("yes") || !cont.equals("no")){
                System.out.println("Please reenter:");
                cont = scan.next();
            }

        }
    }
}
