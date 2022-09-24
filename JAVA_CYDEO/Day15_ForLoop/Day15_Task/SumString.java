package Day15_ForLoop.Day15_Task;

public class SumString {
    public static void main(String[] args) {
        String num = "A1B99C4";
        int result = 0;

        for (int i = 0; i <= num.length()-1 ; i++) {

            if (num.charAt(i) >= 48 && num.charAt(i) <= 57){
                result += Integer.parseInt(""+num.charAt(i));
                //воно запускає в цю строку(result += num.charAt(i);) лише керектери які попали в діапазон іфки
            }
        }
        System.out.println(result);
    }
}
//помилка в тому що оно додає їхні номери в ескіі а не самі чари, тому поставив інтежерпарсіт
//або можна ше було б зробити нестед іф і туда зробити - if (charAt == 47) result += 1;