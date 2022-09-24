package Day16_ForLoop2.Day16_Task;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first positive number: ");
        int first = scan.nextInt();

        System.out.println("Enter second positive number: ");
        int second = scan.nextInt();

        int result = 0;

        for (int i = 1; i <= second; i++) {
            if (first > 0 && second > 0) {
                result += first;        //тіпа якшо тобі треба 5*7 -- це те саме що 7 раз додати 5 до 5
                                        //або якщо 7*5 == це те саме що 5 раз додати 7 до 7                   //лол забув += оператор і воно 10 принтувало
            }else {
                System.out.println("Invalid number");
            }
        }

        System.out.println(result);
    }
}