package Day12_ScannerClass.Day12_Task;

import  java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = scan.nextLine();

        System.out.println("Enter quantity:");
        int quantity = scan.nextInt();

        System.out.println("Enter price:");
        double price = quantity * scan.nextDouble();

        System.out.println("Enter your name:");
        String firstName = scan.next();

        System.out.println(firstName + ", your order for " + quantity +" "+ productName + "has been placed. Your total is: " + price + ".");






    }
}
