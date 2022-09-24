package Day15_ForLoop.Day15_Task;

public class EvenNum {
    public static void mainEven(String[] args) {

        int sumOfEven = 0;

        for (int i = 1; i <= 100; i+=2) {
            sumOfEven += i;
        }
        System.out.println(sumOfEven);

    }

    public static void main(String[] args) {

        int sumOfOdd = 0;

        for (int i = 2; i <= 100; i+=2) {
            sumOfOdd += i;
        }
        System.out.println(sumOfOdd);
    }
}
