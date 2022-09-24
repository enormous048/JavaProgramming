package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        //2. write a program that asks user to enter two strings, and print out the longest string

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string ");
        String firstStr = scan.next();
        System.out.println("Enter last string ");
        String lastStr = scan.next();

        int firstStrSize = firstStr.length();
        int lastStrSize = lastStr.length();

        if (firstStrSize > lastStrSize) {
            System.out.println(firstStr + " is bigger than " + lastStr);
        } else {
            System.out.println(lastStr + " is bigger than " + firstStr);
        }
    }
}
