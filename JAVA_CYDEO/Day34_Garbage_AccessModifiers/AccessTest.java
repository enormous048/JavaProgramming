package Day34_Garbage_AccessModifiers;

public class AccessTest {
    public static void main(String[] args) {

        System.out.println(AccessExamples.str); //public
        System.out.println(AccessExamples.str1);//default
        //System.out.println(AccessExamples.str2);//private is not accessible outside its class

    }
}
