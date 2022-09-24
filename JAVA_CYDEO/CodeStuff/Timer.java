package CodeStuff;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int minutes = scam.nextInt();

        for (int i = minutes; i > 0; i--) {
            for (int j = 59; j >=0 ; j--) {// допоки не пройдуть ітерації іннерлупу то і не зможе відняти 1
                System.out.print("\r" + (i-1)+ " minutes and "+j+ " seconds left."); //\r стирає походу

                try {
                    Thread.sleep(1000);// 1000 millis то одна секунда
                }catch (InterruptedException E){}
            }
        }

        System.out.println();
        System.out.println();

        System.err.println("                         YOUR TIME IS UP!!!");

    }
}
