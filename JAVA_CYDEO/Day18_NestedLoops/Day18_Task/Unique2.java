package Day18_NestedLoops.Day18_Task;

public class Unique2 {
    public static void main(String[] args) {
        String abc = "jbbbbvlppp";
        String result = "";


        for (int j = 0; j <abc.length()-1; j++) {//цей луп існує для того щоб порівняти усі чари один з одним


            char ch = abc.charAt(j);
            int count = 0;

            for (int i = 0; i <= abc.length() - 1; i++) {//цей луп існує для того щоб порівняти певний чар з усіма чарами в стрінгу

                if (ch == abc.charAt(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}