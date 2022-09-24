package Day52_Interface_Lambda;

public class TestFunc2 {
    public static void main(String[] args) {


        MySecondFuncInterface<String> containsGolosni = (str) -> { //now whatever you pass <here> will be datatype for abstract method

            if (str.contains("a") || str.contains("e") ||
                    str.contains("u") || str.contains("i") ||
                    str.contains("o")){

                System.out.println(str + " contains golosni letters");

            }else {
                System.out.println(str + " does not contain golosni letters");
            }

        };
        containsGolosni.test("Pzd skldn");


    }
}
