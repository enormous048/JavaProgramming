package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String login = scan.next();

        System.out.println("Enter password");
        String pass = scan.next();

        boolean bothLogPass = login.equals("Cydeo") && pass.equals("WoodenSpoon");
        boolean logWrong = !login.equals("Cydeo") && pass.equals("WoodenSpoon");
        boolean passWrong = login.equals("Cydeo") && !pass.equals("WoodenSpoon");



        if (bothLogPass){
            System.out.println("Login approved :)");

        } else if (logWrong) {
            System.out.println("Your username is wrong but password exists.");

        } else if (passWrong) {
            System.out.println("Your username exists but password is wrong");

        } else {
            System.out.println("Incorrect username AND password");
        }

        scan.close();

    }



}
