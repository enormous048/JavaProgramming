package Day24_CustomMethod_Return.Day24_Task;

public class Task3 {

    public static boolean isPalindrome (String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse.equalsIgnoreCase(str);
    }




    public static void main(String[] args) {

        boolean palindrome = isPalindrome("level");

        System.out.println("level is palindrome? - " + palindrome);

    }
}
