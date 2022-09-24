package Day14_StringClass2.Day14_Task;

import java.util.Scanner;

public class Apple {
    public static void mainOne() {
        Scanner scan = new Scanner(System.in);
        
        String first = scan.next().substring(0+1);
        String second = scan.next().substring(0+1);
        String full = first + second;

        System.out.println("full = " + full);
    }


    public static void mainTwo() {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String subStr = str.substring(str.lastIndexOf("ly"));
        
        if (subStr.equals("ly")){
            System.out.println("Really!!!");
        }else {
            System.out.println("Never mind");
        }
    }

    public static void mainThree() {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        char one = str.charAt(0);
        if (one == 'x'){
            str = str.replace("x", "");
            System.out.println(str);
        }else {
            System.out.println("All is fine");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String one = scan.next();
        String two = scan.next();

        char lastOfFirst = one.charAt( one.length()-1 );
        char firstOfLast = two.charAt( 0 );

        if (lastOfFirst == firstOfLast){
            System.out.println(lastOfFirst);
        }else {
            System.out.println(one + two);
        }

    }
}
