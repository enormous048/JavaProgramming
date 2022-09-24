package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class Charik {
    public static void main(String[] args) {

        //1. write a program that asks user to enter a sentence then print the first & last characters of the sentence

        Scanner scan = new Scanner(System.in);

        System.out.println("Print a sentence: ");
        String sentence = scan.nextLine();

        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length() - 1);

        System.out.println("First character: " + first + "\nLast character: " + last);


    }
}