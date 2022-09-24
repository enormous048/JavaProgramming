package Day18_NestedLoops.Day18_Task;

public class Practice {
    public static void main(String[] args) {
        String abc = "abbbcckkk";


        for (int j = 0; j <= abc.length()-1; j++) {


            char ch = abc.charAt(j);
            int count = 0;

            for (int i = 0; i <= abc.length() - 1; i++) {

                if (ch == abc.charAt(i)) {
                    count++;
                }

                if (count == 2) {
                    System.out.println(ch + "  "+abc.indexOf(ch));
                    System.exit(0);
                }
            }
        }
    }
}
