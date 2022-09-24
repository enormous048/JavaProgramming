package Day49_Collection_Practice.Tasks2;

import java.util.Arrays;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        //старий і новий спосіб як знаходити унікальні і їх  стрінг запихати

        String str = "annndmmmmskkk";
        String result = "";

        for (int j = 0; j <= str.length()-1; j++) {

            char ch = str.charAt(j); //зафіксовуєм букву
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (ch == str.charAt(i)) {  //порівнюєм шоб знайти частоту
                    count++;
                }
            }

            if (count == 1) { //якшо частота 1 то унікальна
                result += ch + "";
            }
        }


        String str2 = "ekkkktjjjjpsss";
        String result2 = "";

        for (String s : str.split("")) {
            if (Collections.frequency(Arrays.asList(str.split("")), s) == 1){
                result2+=s;
            }
        }

    }
}
