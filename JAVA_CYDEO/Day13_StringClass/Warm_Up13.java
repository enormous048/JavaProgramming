package Day13_StringClass;

import java.util.Scanner;
public class Warm_Up13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullname = scan.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.nextLine();

        System.out.println("Enter your building number: ");
        int buildNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();


        System.out.println(fullname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println("Adress: " + "\n\t\t" + buildNumber + " " + streetName + "\n\t\t" + cityName + ", " + stateName + " " + zipCode);
        System.out.println(schoolName);

    }

}
