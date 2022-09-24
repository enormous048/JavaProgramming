package Day17_Branching_While_Do.Day17_Task;

public class Divisible {
    public static void main(String[] args) {
        String result1 = String.valueOf("");
        String result2 = String.valueOf("");
        String result3 = String.valueOf("");

        for (int i = 1; i <= 100; i++) {
            boolean divisibleByTwo = i % 15 == 0;
            boolean divisibleByFive = i % 5 == 0;
            boolean divisibleByThree = i % 3 == 0;


            if (divisibleByTwo || (divisibleByFive && divisibleByTwo) || (divisibleByThree && divisibleByTwo)){
                result1 += i +" ";

            } else if (divisibleByFive && !divisibleByTwo) {
                result2 += i + " ";

            } else if (divisibleByThree && !divisibleByTwo) {
                result3 += i + " ";
            }
        }


        System.out.println("These numbers are divisible by fifteen " + result1);
        System.out.println("These numbers are divisible only by five " + result2);
        System.out.println("These numbers are divisible only by three " + result3);
    }
}
