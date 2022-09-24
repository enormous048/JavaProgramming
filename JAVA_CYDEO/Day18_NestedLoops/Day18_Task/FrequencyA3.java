package Day18_NestedLoops.Day18_Task;

public class FrequencyA3 {
    public static void main(String[] args) {

        String abc = "aaabccd";
        String result = "";

        for (int j = 0; j <= abc.length()-1; j++) {

            char ch = abc.charAt(j);
            int count = 0; //завдяки тому що інт ініціалізований тут, то кожну ітерацію аутер лупу каунт знову стає нулем


            for (int i = 0; i <= abc.length() - 1; i++) {

                char each = abc.charAt(i);
                if (ch == each) {
                    count += 1;
                }
            }

            if (result.contains(""+ch)) {//якшо резулт вже контейнить ch
                continue; //тут ітерація лупу пропускається тому не буде записувати нові дубліковані чари і каунт
            }

            result += ch;//конкатенуєм
            result += count;

        }
    }
}
