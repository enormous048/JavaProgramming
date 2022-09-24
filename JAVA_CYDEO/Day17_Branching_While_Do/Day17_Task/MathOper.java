package Day17_Branching_While_Do.Day17_Task;

import java.util.Scanner;

public class MathOper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();
        String str = scan.next();

        int result = 0;

        while ( !(str.equals("*") || str.equals("/") || str.equals("+") || str.equals("-")) ){
            System.out.println("Enter a valid operator:");
            str = scan.next();
        }

        switch (str){
            case "*":
                result = first*second;
                break;
            case "/":
                result = first/second;
                break;
            case "+":
                result = first+second;
                break;
            case "-":
                result = first-second;
        }

        System.out.println(result);
    }
}
