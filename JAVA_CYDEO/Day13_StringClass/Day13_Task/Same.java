package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Same {
    //3. write a program that can check if the first and last characters of the string are same

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char first = str.charAt( 0 );
        char last = str.charAt( str.length()-1 );

        if (first == last){
            System.out.println("Same");
        }else {
            System.out.println("Diferrent");
        }



    }
}
