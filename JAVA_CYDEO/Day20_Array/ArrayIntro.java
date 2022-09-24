package Day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        String[] names = new String[3];//о це шо в квдратних душках це довжина, а не номери індексів тому починається з 1

        System.out.println("Enter 3 names");
        String name = scam.next();
        names[0] = name;
        String name2 = scam.next();
        names[1] = name2;
        String name3 = scam.next();
        names[2] = name3;

        System.out.println(Arrays.toString(names));
        //якшо запринтуєш просто неймс то вибє хешкод, а не імена// тому є метод еррей ту стрінг


        //default values(if there is nothing in the variable):
        //non-primitives - null
        //primitives - 0; 0.0(for double and float)
        //             boolean - false



    }
}
