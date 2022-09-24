package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three letters");
        String three = scan.next();

        char middle = three.charAt(three.length() - 2);

        if (three.length() < 3) {
            System.out.println("Word is too short");


        } else if (three.length() > 3) {
            System.out.println("Word is too long");

        } else {
            if (middle == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            }
        }

    }

}
