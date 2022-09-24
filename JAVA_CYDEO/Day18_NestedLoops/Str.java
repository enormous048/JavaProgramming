package Day18_NestedLoops;

public class Str {

    public static void main(String[] args) {
        String str = "aaabcccvvsad";

        String result = "";
        String uniques = "";


        for (int j = 0; j <= str.length()-1 ; j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques += ch;
            }
            if (result.contains(ch + "")) {
                continue;
            }
            result += ch + "" + count;
        }
        System.out.println(result);
        System.out.println(uniques);
    }
}
