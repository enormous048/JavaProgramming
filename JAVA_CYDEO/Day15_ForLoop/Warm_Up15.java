package Day15_ForLoop;

import java.util.Scanner;

public class Warm_Up15 {
    public static void notMain() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();


        char ch1 = s1.charAt(0);


        if (ch1 == 'x') {
            s1 = s1.replaceFirst("x", "a");

        } else {
            System.out.println(s1);
        }
    }


    public static void notMain2() {

        Scanner myObj = new Scanner(System.in);
        String s2 = myObj.next();

        s2 = s2.replace("X", "a");
        s2 = s2.replace("x", "a");
        System.out.println(s2);


    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String firstName = myObj.nextLine();
        String lastName = myObj.nextLine();

        System.out.println(firstName + " " + lastName);


        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        firstName = firstName.replaceFirst(firstName.substring(0, 1), firstName.substring(0, 1).toUpperCase());
        lastName = lastName.replaceFirst(lastName.substring(0,1), lastName.substring(0,1).toUpperCase());

        System.out.println(firstName + " " + lastName);

        //АБО

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        //по суті знаходимо сабстрінги й зразу робимо їх апперами або ловерами, і конкатенуєм їх шоб назад запхати в стрінг.
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);






    }

}

