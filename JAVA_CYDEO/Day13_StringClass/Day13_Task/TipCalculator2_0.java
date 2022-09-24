package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class TipCalculator2_0 {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.println("Split or No Split?");
        String split = scam.next().toLowerCase();

        System.out.println("Number of people?");
        int people = scam.nextInt();

        System.out.println("Enter the check amount");
        int amount = scam.nextInt();


        System.out.println("How was the service quality?");
        String quality = scam.next().toLowerCase();

        while (!quality.equals("excellent") && !quality.equals("great") && !quality.equals("good") && !quality.equals("fair") && !quality.equals("poor")) {
            System.out.println("Enter valid quality:");
            quality = scam.next().toLowerCase();
        }

        double tipRate = (quality.equals("excellent")) ? 0.25 : (quality.equals("great")) ? 0.20 : (quality.equals("good")) ? 0.15 : (quality.equals("fair")) ? 0.10 : (quality.equals("poor")) ? 0.05 : 0;
            //Єба а іфку так не запиїхнеш в змінну як тернарку це плюс
        double totalTip = amount * tipRate;
        double totalToPay = amount + totalTip;



        if (split.equals("yes")){
            System.out.println("Total per person: " + totalToPay/people);
            System.out.println("Tip per person: " + totalTip/people);
            scam.close();
        }else {
            System.out.println("Number of people entered: " + people);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            scam.close();
        }


    }
}