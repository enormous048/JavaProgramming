package Day33_StaticMembers;

public class Employee33 {

    public String name;
    public int age;

    public static String workPlace = "Apple"; //should be static because workplace is the same for all

    public static boolean isAdult = true;

    public static boolean isHuman = true;


    //when you need to engage with instances  - you should declare instance method
    public void working(){
        System.out.println(name+ " is working in " + workPlace);
        //But instance methods could take both fields and statics.
    }

    //when you are engaging ONLY with static variables, you should declare static method.
    //Adantage:
    //We can also use statics in Instance method but its not efficient for memory because every object has own copy.
    //Can invoke with classname only.
    public static void workPlaceInfo(){
        System.out.println("The workplace is " + workPlace);//вибиває помилку якшо сюди вставляю інстанси
    }


}
