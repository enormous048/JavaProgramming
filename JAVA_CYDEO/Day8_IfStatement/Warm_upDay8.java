package Day8_IfStatement;

public class Warm_upDay8 {

    public static void task1() {

        int number = 200;

        boolean checkNum1 = number > 0;
        boolean checkNum2 = number < 0;
        boolean checkNum3 = number == 0;

        System.out.println(number + " is positive? " + checkNum1);
        System.out.println(number + " is negative? "+ checkNum2);
        System.out.println(number + " is zero? "+ checkNum3);
    }


    public static void main(String[] args) {
        int number2 = 65;
        int condition1 = 2;
        int condition2 = 3;
        int condition3 = 5;



        boolean checkNum1 = number2 % condition1 == 0;
        boolean checkNum2 = number2 % condition2 == 0;
        boolean checkNum3 = number2 % condition3 == 0;

        System.out.println(number2 + " is evenly divisible by 2? " + checkNum1);
        System.out.println(number2 + " is evenly divisible by 3? " + checkNum2);
        System.out.println(number2 + " is evenly divisible by 5? " + checkNum3);

    }

}
