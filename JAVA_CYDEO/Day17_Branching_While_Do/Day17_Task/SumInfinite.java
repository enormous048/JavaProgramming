package Day17_Branching_While_Do.Day17_Task;

import java.util.Scanner;

public class SumInfinite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        int result = 0;


        while (num >= 0){
            System.out.println("Enter a number: ");
            num = scan.nextInt();

            if (num>=0){
            result += num;
            }
        }
        System.out.println(result);
    }
}
