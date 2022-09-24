package CodeStuff;
import java.util.Scanner;

public class GuessItself {
    public static int rand(int min, int max){
        int result = (int) (Math.random()*(max - min + 1)) + min;
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide begin and end numbers: ");
        int min = scan.nextInt();
        int max = scan.nextInt();

        int botNum = rand(min, max);
        System.out.println("Computer starts to guess number: " + botNum);

        int count = 1;
        while (true){
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}

            int random = rand(min, max);
            System.out.println(count+" bot attempt: "+random);

            if (botNum < random){
                max = random;
            }else if (botNum > random){
                min = random;
            }else if (botNum == random){
                System.out.println("Number matched!");
                System.out.println("Total attempts: "+ count);
                break;
            }
            count++;
        }

    }
}

