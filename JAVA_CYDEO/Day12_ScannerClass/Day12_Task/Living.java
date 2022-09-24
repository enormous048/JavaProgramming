package Day12_ScannerClass.Day12_Task;

import java.util.Scanner;

public class Living {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        String result = "";

        if (people < 3){
            result = "Lives with less than 3 people";

        }else if (people<=6) {
            result = "Lives with 3-6 people";
        }else{
            result = "Lives with more than 6 people";
        }

        System.out.println(result);
        scan.close();
    }
}
