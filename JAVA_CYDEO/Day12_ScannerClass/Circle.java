package Day12_ScannerClass;

import java.util.Scanner;

public class Circle { //Calculate the area of the circle by using user radius
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double radius = scan.nextDouble();

        double area = radius * radius * 3.14; // 3 * 3 * 3.14  for example
        double perimeter = 2 * radius * 3.14; // 2 * 3 * 3.14  this is not the same as upper

        System.out.println(area + " is the area of given circle"+ "\n"+perimeter + " is a perimeter of given circle");

        scan.close();
    }
}
