package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        //завдання повернути останні три літери
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int size = str.length();
        String result = "";

        if (size <= 0){
            result = "Empty";

        }  else if (size <= 3){
            result = str;

        } else {//запихнути це в елсе треба
            result = str.charAt( str.length()-3 ) + "" + str.charAt(str.length()-2) + "" + str.charAt(str.length()-1); //це сам догадався
            
        }

        System.out.println(result);

        scan.close();
    }


}
