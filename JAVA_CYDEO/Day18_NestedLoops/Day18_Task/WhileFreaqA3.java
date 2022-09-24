package Day18_NestedLoops.Day18_Task;

public class WhileFreaqA3 {

    public static void main(String[] args) {

        String abc = "aavvgggcc";
        String result = "";

        int j = 0;
        while (j <= abc.length()-1) {
            char ch = abc.charAt(j);//зафіксовуєм елемент
            int count = 0;
            j++;

            int i = 0;
            while (i <= abc.length() - 1) {

                if (ch == abc.charAt(i)) {//просуваєм зафіксований через луп і вимірюєм частоту
                    count += 1;
                }
                i++;
            }

            if (result.contains(""+ch)){
                continue;
            }
            result += ch; //запихаєм чар і частоту в резулт, якшо резулт ше не контейнить певний елемент
            result += count;

        }

        System.out.println(result);
    }
}
