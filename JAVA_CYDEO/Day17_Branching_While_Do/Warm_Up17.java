package Day17_Branching_While_Do;

public class Warm_Up17 {
    public static void main(String[] args) {

        String str = "Abcbbas";
        char ch = 'b';
        String  result = "";

        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i) == ch){
                result += str.charAt(i);

            }
        }
        System.out.println(result.length());


    }
}
