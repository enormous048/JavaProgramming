package Day23_CustomMethods_Void;

public class MethodPractice {
    public static void even(){

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
    public static void checkNum(int num){
        String result;

        if (num % 2 == 0){
            result = " is even number";
            System.out.println(num + result);
        }else {
            result = " is odd number";
            System.out.println(num + result);
        }


    } //void with parameter

    public static void yearOfBirth(int age){

        int result = 2022 - age;
        System.out.println(result + " is the year of birth.");
    }

    public static void numsBetween(int start, int end){
        String result = "";

        for (int i = start+1; i < end; i++) {
            result += i + "  ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {


        checkNum(10); //тут можна і сканер запихнути якшо шо
        //when method has a parameter you must provide an argument, othewise error


        numsBetween(12, 99);
    }
}
