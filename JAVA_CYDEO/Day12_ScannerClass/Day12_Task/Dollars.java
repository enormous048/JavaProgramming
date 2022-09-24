package Day12_ScannerClass.Day12_Task;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents: ");

        int cent = scan.nextInt();
        int dollar = cent / 100;
        int centRemainder = cent % 100;

        String result = "";


        if (cent % 100 == 0){
            result = cent + " equal to: " + dollar + " dollars";


        }else {

            result = cent + " equal to: " + dollar + " dollars and " + centRemainder + " cents.";
        }

        System.out.println(result);


    }

}
