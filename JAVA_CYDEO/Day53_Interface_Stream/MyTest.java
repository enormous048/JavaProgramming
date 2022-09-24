package Day53_Interface_Stream;

public class MyTest {
    public static void main(String[] args) {


        //How you write lambda expression depends on abstract method of func interfaces.
        MyFifthFunctionalInterface<String> reverse = (str) -> {
            String reverse2 = new StringBuilder(str).reverse().toString(); //another way to reverse String

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--){
                result+=str.charAt(i);
            }
            return result;


        };

        MyFifthFunctionalInterface<Integer> cube = (n) -> {
            return n*n*n;
        };


        String str = reverse.function5("Naz Kovalchuk");
        int number = cube.function5(3);
        System.out.println(str);
        System.out.println("number = " + number);
    }
}
