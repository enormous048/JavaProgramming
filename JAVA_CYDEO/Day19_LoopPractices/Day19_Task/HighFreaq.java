package Day19_LoopPractices.Day19_Task;

public class HighFreaq {
    public static void main(String[] args) {

        String abc = "abvvvvvccc";
        String result = "";
        int max = 0; //макс тут шоб вкінці лупів вибило лише найбільшо частотний

        for (int j = 0; j <= abc.length() - 1; j++) {


            char ch = abc.charAt(j);
            int count = 0;

            for (int i = 0; i <= abc.length() - 1; i++) {

                if (ch == abc.charAt(i)) {
                    count++;
                }
            }
            if (count > max) {
                result = ""+ch;
                max = count;
            }
        }
        System.out.println(result +"   "+ max);
    }
}