package Day12_ScannerClass.Day12_Task;

import java.util.Scanner;

public class Shares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many shares you have?");
        int share = scan.nextInt();

        if (share <= 0){
            scan.close();
        }


        System.out.println("Have much your value have you put in?");
        double money = scan.nextDouble();

        scan.nextLine();
        System.out.println("Tell us the name of the company you bougth shares from: ");
        String company = scan.nextLine();


        System.out.println("Your total stock market holding is " + money + " which is made up of " + share + " shares. "+ company +" is your company holdings");






        scan.close();


    }



}
