package Day23_CustomMethods_Void.Day23_Task;

public class Calculator {


    public static void calc(int firstNum , int lastNum, char operator){

        switch (operator){
            case '+':
                System.out.println(firstNum + lastNum);
                break;

            case '-':
                System.out.println(firstNum- lastNum);
                break;

            case '*':
                System.out.println(firstNum * lastNum);
                break;

            case '/':
                System.out.println(firstNum / lastNum);
                break;
        }
    }

    public static void main(String[] args) {

        calc(12, 2, '/');

    }
}
