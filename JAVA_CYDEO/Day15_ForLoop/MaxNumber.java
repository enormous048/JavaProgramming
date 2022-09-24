package Day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2000000;

        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Provide number: ");
            int scam = scan.nextInt();
            if (scam > max ) { //кожен раз буде заново есайгнити якшо скам бльший за попередній макс
                max = scam;
            }
        }
        System.out.println("max = " + max);






    }
}
