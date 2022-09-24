package Day16_ForLoop2.Day16_Task;

import java.util.Scanner;

public class HowManyChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String  str = scan.next();

        System.out.println("Enter a char: ");
        String ch = scan.next();

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

            if ( (""+str.charAt(i)).equals(ch) ) {
                //луп просуває кожен індекс через іфку, якшо якись індекс виявився тру, то цей індекс запихається в резулт завдяки str.charAt(i);
                    result += ""+str.charAt(i);
            }
        }
        System.out.println(result.length());
    }
}
