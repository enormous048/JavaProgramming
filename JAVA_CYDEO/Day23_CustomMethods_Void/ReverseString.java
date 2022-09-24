package Day23_CustomMethods_Void;

public class ReverseString {

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public static String[] reverseArray(String[] arr){

        String[] result = new String[arr.length];

        for (int i = arr.length-1, j = 0; i >= 0 ; i--, j++) {
            result[j] = arr[i];
        }
        return result;

    }







    public static void main(String[] args) {
        String spoon = "pylyp";
        String reversed = reverse(spoon);  // зажми контрл і мишкою проведи по імені метода - так буде силка до нього

        if (reversed.equals(spoon)){
            System.out.println("It is palindrome");
        }

    }//походу з войдом я далі не взмозі використати реверснуту стрінг в мейн щоб далі шось з нею робит --
     // так і є ти не зможеш есайнути ту енозер веріабл
}
