package Day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);

        System.out.println("How many numbers would you like to provide?");
        int num = scam.nextInt();

        int[] allNums = new int[num];

        System.out.println("Enter " +num+ " numbers");
        for (int i = 0; i <= num-1; i++) {
            allNums[i] = scam.nextInt();
        }

        System.out.println(Arrays.toString(allNums));

    }
}
