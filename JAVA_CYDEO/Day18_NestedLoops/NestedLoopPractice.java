package Day18_NestedLoops;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     while (true) {
         System.out.println("Enter your age:");
         int age = scan.nextInt();

         while (age <= 0 || age >= 120) {
             System.out.println("Enter the valid age:");
             age = scan.nextInt();
         }
         if (age >= 18){//вайл луп зверху імплиситлі робить так шо тут вже не треба вказувати <=120
             System.out.println("You are eligible");
         } else {
             System.out.println("You are not eligible");
         }


         System.out.println("Would you like to continue?");
         String cont = scan.next().toLowerCase();

         while (!(cont.equals("yes") || cont.equals("no"))){//or бо не може і то і то бути іквалс одночасно
             System.out.println("Invalid answer");
             System.out.println("Would you like to continue?");
             cont = scan.next().toLowerCase();
         }

         if (cont.equals("no")){
             System.exit(0);
         }

     }
    }
}
