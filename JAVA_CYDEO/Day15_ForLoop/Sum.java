package Day15_ForLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Short cut =  fori
        int sum = 0;
        // 1 + 2 + 3 + 4

        for (int i = 1; i <= 100; i++) {

            sum += i;
        }
        System.out.print(sum);
        System.out.println();


        //Хочу тепер шо юзер ввів якесь число і шоб всі числа шо перед ним додались
        Scanner scan = new Scanner(System.in);
        int check = 0;
        
        System.out.println("Enter number to get the sum of all");
        int sum2 = scan.nextInt();

        for (int i = 1; i <= sum2; i++) {
            check += i; //якшо сюди вставляєш верібл сканнера замість чеку то вибиває неправильно; напевно через то шо в скана свої особливості
        }
        System.out.println(check);


    }
}
