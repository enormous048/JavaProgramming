package Day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] num = new int[100]; //0~99

        for (int i = 0; i <= num.length-1; i++) {
            num[i]= 1+i;
        }

        System.out.println(Arrays.toString(num));


        for (int i = num.length-1; i >= 0 ; i--) {
            num[i]= 100-i;
        }

        System.out.println(Arrays.toString(num));





        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers");


        int[] nums = new int[10];


        for (int i = 0; i < nums.length-1; i++) {
            nums[i] = scan.nextInt();
        }

        int max = nums[0]; //можна початком зробити і номер з нульового індексу все одно потім зміниться
        int min = nums[0];
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i]>max){
                max=nums[i];
            }

            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
