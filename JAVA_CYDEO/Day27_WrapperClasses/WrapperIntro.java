package Day27_WrapperClasses;

public class WrapperIntro {
    public static void main(String[] args) {

        //Wrapper classes allows us convert primitive data type into an object
        //(Byte - with upper latter because every class starts with upper)

        //We need them because we can't use primitive types in Collection and Map
        //As wrapper is a class we have some useful methods in them




        //Auto boxing  -  when primitives are converted into wrapper classes  (but it is done implicitly)
        int num1 = 100;
        Integer integer1 = num1; //but you cant convert to other Wrapper class type, only to Integer

        //Unboxing - when wrappers are converted into primitives      (but it is done implicitly)
        Integer integer2 = 120;
        int num2 = integer2;

        long n = integer2; //here we can convert to other data type

        //primitive can be converted only to its own wrapper class type; but Wrapper class can be converted to every primitive




        int[] pr = {1,3,5,6,6};
        Integer[] wr = {1,2,3,56,77}; //but other data structures supports only Wrappers
    }

}
