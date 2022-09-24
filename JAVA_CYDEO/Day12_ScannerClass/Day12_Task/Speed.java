package Day12_ScannerClass.Day12_Task;

import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int result = 0;

        if (currentSpeed > speedLimit){
            result = currentSpeed - speedLimit;
            System.out.println("You are driving " + result + " pmh above the speedlimit");

        }else {
            System.out.println("You are driving normally");
        }





    }
}
