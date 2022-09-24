package Day33_StaticMembers;

import java.util.ArrayList;

public class StaticBlock {
    //Before java8 you could run a class with static block or with main method.
    //After java8 you could run a class only with main method, but static is runned first then main.


    public int radius;
    public static double pi;
    //when you have static variable that require multiple steps to set them, then you should set it in static block
    public static ArrayList<String> str;
    //str.add() not working here, only in static block


    public StaticBlock(int radius){
        this.radius = radius;
    }

    static{
        //static is first thing that gets executed when running. //Can only be runned once
        //The only use of static block is to initialise static variables, can't accept instances.

        pi = 3.14;
        str = new ArrayList<>();
        str.add("Naz");
    }

}
