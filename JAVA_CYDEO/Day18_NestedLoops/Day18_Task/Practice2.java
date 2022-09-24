package Day18_NestedLoops.Day18_Task;

public class Practice2 {
    public static void main(String[] args) {
        String abc = "abbcckk";
        String result = "";


        for (int j = 0; j <= abc.length()-1; j++) {


            char ch = abc.charAt(j);
            int count = 0;

            for (int i = 0; i <= abc.length() - 1; i++) {

                if (ch == abc.charAt(i)) {
                    count++;
                }
            }



            if (result.contains(""+ch)){ //щоб було не подва тих а по одному екземпляру
                continue;
            }
            if (count == 2) { //запринтовуєм хіба ті які маю частоту в 2
                result+=ch;

            }
        }
        System.out.println(result);
    }
}


