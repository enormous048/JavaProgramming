package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class ThreeWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three words");
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();

        boolean sameLength = first.length() == second.length() && first.length() == third.length() && third.length() == second.length();
        boolean someLength = first.length() == second.length() || first.length() == third.length() || third.length() == second.length();

        String result = "";



        if (sameLength){
            result = "All words are the same length";

        } else if (someLength) {
            result = "Some words have the same length";

        }else {
            result = "All have different length";
        }

        System.out.println("result = " + result);
        scan.close();


    }
}
