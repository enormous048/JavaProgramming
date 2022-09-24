package CodeStuff;
import java.util.Scanner;

public class Guess {
    public static int rand(int min, int max){
        int result = (int) (Math.random()*(max - min + 1)) + min;
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide begin and end numbers: ");
        int min = scan.nextInt();
        int max = scan.nextInt();

        int count = 0;
        while (true){
            int random = rand(min, max);
            System.out.println(random);
            System.out.println("Provide h - higher; l - lower; c - correct");
            String hlc = scan.next();

            if (hlc.equals("h")){
                min = random;
            }else if (hlc.equals("l")){
                max = random;
            }else if (hlc.equals("c")){
                System.out.println("Number matched!");
                System.out.println("Total attempts: "+ count);
                break;
            }
            count++;
        }

    }
}
