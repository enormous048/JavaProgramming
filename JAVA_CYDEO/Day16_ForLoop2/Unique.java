package Day16_ForLoop2;

public class Unique {
    public static void main(String[] args) {
        String str = "abbbcccd";
        String result = "";


        for (int i = 0; i <= str.length()-1; i++) {

            char s = str.charAt(i);//завдяки лупу чарет кожен повтор буде дорівнювати на один індекс більше
            if (str.indexOf(s) == str.lastIndexOf(s)) { //означає що юнік бо не може бути ономер індекса дорівнювати номеру останнього індекса якби було більше ніж один керектер
                result += s;
            }
        }

        System.out.println(result + " - unique");


    }
}
