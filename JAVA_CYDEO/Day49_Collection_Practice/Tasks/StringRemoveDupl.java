package Day49_Collection_Practice.Tasks;

import Day48_Collection.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class StringRemoveDupl {
    public static void main(String[] args) {

        String str = "aaanfnnfjsjsjjjjsllllq";

        String result = "";

        for (  String s : new LinkedHashSet<>(Arrays.asList( str.split("") ))  ){
            if (!result.contains(s)){

                result += s + Collections.frequency( Arrays.asList(str.split("")) , s);

            }
        }
        /*
        Перетворюєм стрінг в стрінг еррей потім в лінкедсет і зафіксовуєм елемент.
        (можна було просто Arrays.asList( str.split("") поставити в фор іч, але тоді більше ітерацій лупу буде )

        якшо цього елементу ше нема в резулті, то добавляєм цей елемент і його частоту в стрінгу
        */

    }
}
