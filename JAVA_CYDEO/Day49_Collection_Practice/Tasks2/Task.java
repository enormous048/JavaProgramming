package Day49_Collection_Practice.Tasks2;

import java.util.Arrays;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {

        //старий і новий спосіб стрінг фріквенсі
        String str = "abbbsddjjjw";

        String result = "";


        for (int j = 0; j <= str.length()-1; j++) {

            char ch = str.charAt(j);  //зафіксовуєм чар
            int countOfChars = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                if (ch == str.charAt(i)) { // порівнюєм зафіксований чар з усіма чарами в стрінгу
                    countOfChars++; //якшо найшовся такий самий то ++
                }
            }
            if (!result.contains(ch + "")) {
                result += ch + "" + countOfChars;
            }

        }

        String str2 = "ssdjfjfjfjsjnnnns";
        String result2 = "";

        for (String s : Arrays.asList(str2.split(""))){

            if (!result2.contains(s)){
                result2+= s+ Collections.frequency(Arrays.asList(str2.split("")), s );
            }
        }

    }
}
