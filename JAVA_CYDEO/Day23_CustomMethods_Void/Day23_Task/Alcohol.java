package Day23_CustomMethods_Void.Day23_Task;

public class Alcohol {

    public static void isEligible(int age){

        if (age < 18){
            System.out.println("your age is " +age+" you are eligible.");
        }else {
            System.out.println("your age is "+age+ " you are not eligible.");
        }

    }

    public static void isEligibleToVote(int age, String country){

        if (age >= 21 && country.equals("USA")){
            System.out.println("you are eligible.");
        }else {
            System.out.println("you are not eligible.");
        }

    }



    public static void main(String[] args) {

        isEligible(18);


    }
}
