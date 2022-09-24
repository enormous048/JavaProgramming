package Day15_ForLoop.Day15_Task;

public class Palindrome {
    public static void main(String[] args) {

        String pal = "Level".toLowerCase();
        String result = "";

        for (int i = pal.length()-1; i >= 0; i--) {
            result += pal.charAt(i);
        }

        boolean isPalindrome = pal.equals(result);
        if (isPalindrome){
            System.out.println(pal + " is palindrome word");
        }else {
            System.out.println(pal + " is not palindrome word bitch");
        }
    }
}
