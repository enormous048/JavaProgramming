package Day15_ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int min = +200000000;

        for (int i = 1; i <= 5; i++) { // =1  <=5   це те саме що   =0  <5

            System.out.println("Enter a number"); //без луп нам би весь час треба було створювати верібли
                                                  // запихати в булінки а так легко можем дізнатись мін макс багатьох номерів
            int scam = scan.nextInt();

            if (min > scam){  //якшо попередня мін більша за новий скам то мін стає цим скамом
                min = scam;
            }
        }
        System.out.println("min = " + min);;


    }
}
