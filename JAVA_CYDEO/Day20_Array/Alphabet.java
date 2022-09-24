package Day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] abetka = new char[26];


        for (int i = 0; i <= abetka.length-1; i++) {
            abetka[i] = (char) (65+i); //якшо велью є ітежер то можна робити кастинг на чар
        }

        //OR

        for (char i = 'A', j = 0; i<= 'Z' && j<= abetka.length-1; i++, j++){
            abetka[j] = i;
        }

        System.out.println(Arrays.toString(abetka));



        for (int i = abetka.length-1; i >=0 ; i--) {
            abetka[i] = (char) ('Z'-i); // abetka[i] - індекс має 26 і туда запихає 'А'
        }
        System.out.println(Arrays.toString(abetka));

        //OR

        for (int i = 0, j = 'Z'; i <= args.length-1 && j >= 'A'; i++, j--) {
            abetka[i] = (char) j;
        }
    }
}
