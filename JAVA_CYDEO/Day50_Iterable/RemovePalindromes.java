package Day50_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>(Arrays.asList("heart", "lol", "pylyp", "eye", "mam", "mom"));

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String str = it.next(); //треба лише раз викликати it.next() бо кожен визов ит некст буде пушити на наступний елемент
            String reversed = "";

            for (int i = str.length()-1; i >= 0;  i--) {
                reversed+= str.charAt(i);
            }

            if (str.equals(reversed)){
                it.remove();
            }
        }
        System.out.println(list);



        //================================================================


        //ArrayList<String>  list2 = new ArrayList<>(Arrays.asList("heart", "lol", "pylyp", "eye", "mam", "mom"));

        //Predicate is boolean expression
        /*
        Predicate<String> palindrom = str -> {
            String reversed = "";

            for (int i = str.length()-1; i >= 0;  i--) {
                reversed+= str.charAt(i);
            }
            return str.equalsIgnoreCase(reversed);

        }; //str репрезентує кожен елемент з листа

        list2.removeIf(palindrom);
        */

        /*
        list2.removeIf( str -> {
            String reversed = "";

            for (int i = str.length()-1; i >= 0;  i--) {
                reversed+= str.charAt(i);
            }
            return str.equalsIgnoreCase(reversed);

        }); //str репрезентує кожен елемент з листа

         */
    }
}
