package Day52_Interface_Lambda;

public class TestFunc3 {

    public static void main(String[] args) {


        MyFirstFuncInterface evenlyDivisible = (n) -> {

            if (n%3 == 0 && n%5 == 0){
                System.out.println(n + " is evenly divisible by 3 and 5");
            }else{
                System.out.println(n + " is not evenly divisible by 3 and 5");
            }
        };

        evenlyDivisible.function(15);
        evenlyDivisible.function(10);


    }
}
