package Day17_Branching_While_Do;

public class RemoveDublicate {
    public static void main(String[] args) {
        String str = "ABABABAB";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {

            if (result.contains( ""+str.charAt(i) )){ //якшо контейнить то ытерацыя лупу пропускається
                continue;
            }

            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
