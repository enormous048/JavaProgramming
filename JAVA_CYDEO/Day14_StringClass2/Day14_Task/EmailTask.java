package Day14_StringClass2.Day14_Task;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toLowerCase();

        String firstName = str.substring(1, str.indexOf("_"));
        String lastName = str.substring(str.indexOf("_")+2, str.lastIndexOf("@"));
        String domain = str.substring(str.indexOf("@")+1, str.lastIndexOf("."));

        String upperFirst = (""+str.charAt(0)).toUpperCase(); //так переводим чар в стрінг і можна чари робити апперами або ловерами
        String upperLast = (""+ str.charAt( str.lastIndexOf("_")+1 )).toUpperCase();



        System.out.println("First name: "+ upperFirst + firstName);
        System.out.println("Last name: " + upperLast + lastName);
        System.out.println("Domain name: " + domain);


    }
}

