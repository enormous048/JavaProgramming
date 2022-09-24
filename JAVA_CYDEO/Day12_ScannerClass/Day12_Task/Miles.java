package Day12_ScannerClass.Day12_Task;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles ");

        double mile = scan.nextDouble();
        double km = mile * 1.609;

        System.out.println(mile + " miles equals to " + km + " kilometers");
    }
}
