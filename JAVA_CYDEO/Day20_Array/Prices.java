package Day20_Array;

import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        String[] item = new String[5];
        int[] prices = new int[5];

        int total = 0;

        System.out.println("Enter 5 items");
        for (int i = 0; i <= item.length-1; i++) {
            item[i] = scam.next();
        }

        System.out.println("Enter 5 prices");
        for (int i = 0; i <= prices.length-1; i++) {
            prices[i] = scam.nextInt();
            total += prices[i];
        }

        System.out.println(total + "$ in total.");

        for (int i = 0; i <= item.length-1; i++) {
            System.out.println(item[i] +" -- "+ prices[i]);
        }
    }
}
