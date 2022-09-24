package Day27_WrapperClasses;

public class WrapperMethods {

    public static void main(String[] args) {

        //1. parse methods : converts string to primitive datatype
        //2. valueOf methods : converts string to a Wrapper class - thats the only difference


        String str = "123";
        int n = Integer.parseInt(str); //retuns int

        String str2 = "10.3";
        double n2 = Double.parseDouble(str2); //returns double


        String  s = "228";
        Integer in = Integer.valueOf(s);
        int prim = Integer.valueOf(s); // unboxing


        int maxValue = Integer.MAX_VALUE; //returns maximum possible integer
        int minValue = Integer.MIN_VALUE; //.. MIN_VALUE thats a variable btw not a method

    }
}
