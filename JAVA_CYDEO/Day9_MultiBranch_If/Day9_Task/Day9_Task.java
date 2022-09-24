package Day9_MultiBranch_If.Day9_Task;

public class Day9_Task {
    //1. write a java program that can convert numbers between 0 ~ 9 to words
    public static void NumberConvert() {

        int a = 1;

        if (a == 0) {
            System.out.println("Zero");
        }else if (a == 1) {
            System.out.println("One");
        }else if (a == 2) {
            System.out.println("Two");
        }else if (a == 3) {
            System.out.println("Three");
        }else if (a == 4) {
            System.out.println("Four");
        }else if (a == 5) {
            System.out.println("Five");
        }else if (a == 6) {
            System.out.println("Six");
        }else if (a == 7) {
            System.out.println("Seven");
        }else if (a == 8) {
            System.out.println("Eight");
        }else if (a == 9) {
            System.out.println("Nine");
        }
    }



    public static void Char() {
        char ch = 'F';
        boolean specialCharType = (ch >= 31 && ch <=47) || (ch >= 58 && ch <= 64) || (ch >= 0 && ch <= 30) || (ch >= 91 && ch <= 96) || (ch >=123 && ch <= 127);
        boolean digitType = ch >= 48 && ch <= 57;

        if (specialCharType){
            System.out.println("Special character");
        }else if(digitType)  {
            System.out.println("Digit");
        }else{
            System.out.println("Literal");

        }
        //Короче дізнався шо там можна отак зробити (ch >= 'A' && <= 'Z') тому можна і так і так

    }
}
