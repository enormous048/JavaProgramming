package Day15_ForLoop.Day15_Task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor *= i;
        }
        System.out.println(factor);
    }
}
//Факторіал це коли помножити наприклад 5 * 4 * 3 * 2.
//i<= num показує скільки раз буде то множитись і які саме числа там будуть множитись\\ початковий фактор 1 бо на ноль не буде множитись
