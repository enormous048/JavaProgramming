package Day19_LoopPractices.Day19_Task;

import java.util.Scanner;

public class TaxRate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hour profit: ");
        double hourProfit = scan.nextDouble();
        if (hourProfit<=0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }

        System.out.println("How many hours per week: ");
        double hoursWeek = scan.nextDouble();
        if (hoursWeek < 1 || hoursWeek > 144) {
            System.err.println("Invalid entry");
            System.exit(0);
        }


        System.out.println("Enter your state taxrate:  ");
        double taxrate = scan.nextDouble();
        if (!(taxrate > 0 && taxrate < 10)) {
            System.err.println("Invalid entry");
            System.exit(0);
        }

        double grosSalary = hourProfit * hoursWeek * 4;
        double federal = (grosSalary * 26) /100;
        double state = (grosSalary * taxrate) / 100;

        System.out.println("Gross salary $"+ grosSalary);
        System.out.println("Federal tax decrease $" + federal);
        System.out.println("State tax decrease $"+ state);
        System.out.println("Total tax $" + (federal + state));
        System.out.println("Net income $" + (grosSalary - (federal + state)));


    }
}
