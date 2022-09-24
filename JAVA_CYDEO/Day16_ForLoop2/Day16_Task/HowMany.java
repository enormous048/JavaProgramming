package Day16_ForLoop2.Day16_Task;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for 5 times: ");
        int hasNegative = 0;
        int hasPositive = 0;

        for (int i = 1; i <= 5; i++) {
            int num = scan.nextInt();
            if (num < 0){
                hasNegative += 1;
            }
            if (num > 0){
                hasPositive += 1;
            }
        }
        System.out.println("User entered " + hasNegative + " numbers and "+ hasPositive +" positive numbers!");
    }
}
