package Day49_Collection_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayRemoveDuplicates {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Naz", "Naz", "Naz", "Jay"};

        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);  //new String[0]  в квдратних дужках можна будь що ставити воно ітак заміниться на довжину set.

        //OR

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
                                  //Констактор приймає тільки колекшин тайп      + туЕррей щоб заесайнити до arr





        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,200,200,200,300,400,500,600));

        list = new ArrayList<>( new LinkedHashSet<>(list) );
                                 //Констактор приймає тільки колекшин тайп
    }
}
