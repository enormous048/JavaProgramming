package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 letters' word");
        String word = scan.next();

        String reverse = "" + word.charAt( word.length()-1 ) + word.charAt( word.length()-2 ) + word.charAt( word.length()-3 ) +
                word.charAt( word.length()-4 ) + word.charAt( word.length()-5 );

        String result = "";



        if (word.length() < 5){
            result = "Your word is too short";

        } else if (word.length() > 5){
            result = "Your word is too long";

        }else {
            result = reverse;
        }

        System.out.println(result);

        scan.close();

    }
}
