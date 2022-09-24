package Day49_Collection_Practice.Tasks2;

import java.util.*;

public class Transale {
    public static void main(String[] args) {

        String[] arr = {"java, java, python, html, sql, sql"};
        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);


        Set<Integer> set = new LinkedHashSet<>( Arrays.asList(1,2,3,4,5,6,7,8,9) );
        ArrayList<Integer> list = new ArrayList<>( set );
        set.clear();

        for (Integer integer : list) {
            integer*=2;
            set.add(integer);
        }

        System.out.println("set = " + set);
        System.out.println( new ArrayList<Integer>( set ).get(6) );


    }
}
