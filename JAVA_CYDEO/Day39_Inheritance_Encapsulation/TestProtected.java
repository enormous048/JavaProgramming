package Day39_Inheritance_Encapsulation;

import Day40_Protected_Final.Protected_Keyword;

public class TestProtected extends Protected_Keyword {

    public static void main(String[] args) {
        //System.out.println(pi);  pi is default is not visible
        System.out.println(pi1); //protected is visible but only in subclass, if this class doesnt extend then it wont be visible
    }
}
