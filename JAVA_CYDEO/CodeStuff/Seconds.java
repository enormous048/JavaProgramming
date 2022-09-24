package CodeStuff;
import java.util.*;
public class Seconds {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.println("Provide number of seconds: ");
        int seconds = scam.nextInt();
        String time = "";
        int sec = 0, minutes = 0, hours = 0, days = 0, years = 0;
        years = seconds / 365 / 24 / 60 / 60;
        days = (seconds / 24 / 60 / 60) -     (years * 365);
        hours = (seconds / 60 / 60) -     ((days * 24) + (years * 365 * 24));
        minutes = (seconds / 60) -    ((hours * 60) + (days * 24 * 60) + (years * 365 * 24 * 60));
        sec = seconds -            ((minutes * 60) + (hours * 60 * 60) + (days * 24 * 60 * 60) + (years * 365 * 24 * 60 * 60));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(years, days, hours, minutes, sec));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(" year", " day", " hour", " minute", " second"));
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) > 0) {
                if (list.get(i) == 1) {time += list.get(i) + list2.get(i) + " ";}
                else {time += list.get(i) + list2.get(i) + "s ";}}}
        System.out.println(time);}}