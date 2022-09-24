package Day52_Interface_Lambda.funcCalculator;

public class CalcTest {
    public static void main(String[] args) {


        MyForthInterface calculate = (assigner, firstNum, lastNum) -> {

            int result = (assigner == '+')? firstNum+lastNum  :(assigner == '-')? firstNum-lastNum  :(assigner == '*')? firstNum*lastNum
                    : firstNum/lastNum;

            return result;
        };

        int multiply = calculate.calculate('*', 3, 3);

        System.out.println("multiply = " + multiply);

    }
}
