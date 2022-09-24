package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstname = scan.nextLine().toUpperCase(); //ось так можна з інпуту апперкейс зробити

        System.out.println("Enter last name");
        String lastname = scan.nextLine().toUpperCase();

        char first = firstname.charAt(0);
        char last = lastname.charAt(0);

        System.out.println(first + "." + last);



    }


}
