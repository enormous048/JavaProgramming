package Day14_StringClass2.Day14_Task;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String acc = scan.next();
        String result = "";

        char first = acc.charAt(0);

        if (first == '2'){
            result = "Account should be 7 chars long";
        } else if (first == '5') {
            result = "Account should be 10 chars long";
            
        } else {
            result = "Number do not meet the requirements";
        }

    }
}
