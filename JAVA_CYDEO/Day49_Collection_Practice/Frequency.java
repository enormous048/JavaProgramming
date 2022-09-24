package Day49_Collection_Practice;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {


        String str = "aaaggcvgvkskskkkss";

        String result = "";
                                                  //Констактор приймає тільки колекшин тайп
        for (String s : new LinkedHashSet<String>( Arrays.asList(str.split(""))) ) {

            if (!result.contains(s)){
                result+= s + Collections.frequency(Arrays.asList(str.split("")), s);
            }
        } //переводим стр в еррей букв, далі в колекшин тайп.
        System.out.println(result);
        

        
        

        //--------------------------------------------------------
        //return fifth element after removing the duplicates

        Integer[] arr = {1,2,3,4,5,6,7,8,9,9,1,2,3,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
        System.out.println(arr[4]);


        //--------------------------------------------------------
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,8,9));
        System.out.println( set.toArray(new Integer[0])[4] );  //конвертимо в еррей щоб дістати з сету 5 елемент

        System.out.println( new ArrayList<>( set ).get(4)  );  //конвертимо в еррейЛист щоб дістати з сету 5 елемент

    }
}
