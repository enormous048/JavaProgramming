package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        System.out.println("Split or No Split?");
        String split = scam.next();

        System.out.println("Number of people?");
        int people = scam.nextInt();

        System.out.println("Enter the check amount");
        int amount = scam.nextInt();

        System.out.println("How was the service quality?");
        String quality = scam.next();


        double totalToPay = 0;
        double totalTip = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;


        if (split.equals("Yes")) {

            if (quality.equals("Poor")) {
                totalToPay = amount + (amount * 0.05);
                totalTip = totalToPay - amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            } else if (quality.equals("Fair")) {
                totalToPay = amount + (amount * 0.10);
                totalTip = totalToPay - amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            } else if (quality.equals("Good")) {
                totalToPay = amount + (amount * 0.15);
                totalTip = totalToPay - amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            } else if (quality.equals("Great")) {
                totalToPay = amount + (amount * 0.20);
                totalTip = totalToPay - amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            } else {
                totalToPay = amount + (amount * 0.25);
                totalTip = totalToPay - amount;
                totalPerPerson = totalToPay / people;
                tipPerPerson = totalTip / people;

            }
            System.out.println("Number of people entered: " + people);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
            scam.close();


        } else {
            if (quality.equals("Poor")) {
                totalToPay = amount + (amount * 0.05);
                totalTip = totalToPay - amount;

            } else if (quality.equals("Fair")) {
                totalToPay = amount + (amount * 0.10);
                totalTip = totalToPay - amount;

            } else if (quality.equals("Good")) {
                totalToPay = amount + (amount * 0.15);
                totalTip = totalToPay - amount;

            } else if (quality.equals("Great")) {
                totalToPay = amount + (amount * 0.20);
                totalTip = totalToPay - amount;

            } else {
                totalToPay = amount + (amount * 0.25);
                totalTip = totalToPay - amount;

            }
            System.out.println("Number of people entered: " + people);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            scam.close();
        }
    }
}


