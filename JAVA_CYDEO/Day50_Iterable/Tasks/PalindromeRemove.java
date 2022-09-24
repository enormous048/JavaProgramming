package Day50_Iterable.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PalindromeRemove {
    public static void main(String[] args) {
        //ітератор зроблений тому що видаляти з коллекшин тайпів проблематично в лупах


        ArrayList<String> list = new ArrayList<>(Arrays.asList("lol", "radar", "rotor", "pylyp", "tarzan", "heart"));

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String str = it.next();
            String reversed = "";

            for (int i = str.length()-1; i >= 0; i++) {
                reversed += str.charAt(i);
            }

            if (str.equalsIgnoreCase(reversed)){
                it.remove();
            }

        }



    }
}
