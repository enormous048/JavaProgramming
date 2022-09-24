package Day15_ForLoop;

public class CharForLoop {
    public static void main(String[] args) {
        System.out.println();
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }


        System.out.println();
        for (char ch2 = 'Z'; ch2 >= 'A'; ch2--){
            System.out.print(ch2 + " ");
        }

        //АБО

        System.out.println();
        for (int ch3 = 65; ch3 <= 90; ch3++){
            System.out.print((char) ch3 + " ");//Можна робити тайп кастинг з інтежеру на чар
        }
    }
}
