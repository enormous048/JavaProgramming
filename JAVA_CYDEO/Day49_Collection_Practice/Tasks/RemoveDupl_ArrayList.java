package Day49_Collection_Practice.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDupl_ArrayList {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('m', 'h', 'h', 'm', 'f', 'f', 'f', 'y', 'q'));

        list = new ArrayList<>( new LinkedHashSet<>(list) ); //remove duplicates



        ArrayList<Double> list2 = new ArrayList<>();
        list2.addAll( Arrays.asList(11.2, 11.7, 77.6, 44.6,56.6,77.6) );

        list2 = new ArrayList<>( new TreeSet<>(list2) );
        System.out.println( list2.get( list2.size()-1 ) ); //max num



        ArrayList<Float> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(12f, 3f, 45f, 6f, 6f, 7f, 8f, 888f, 8f));

        list3 = new ArrayList<>( new TreeSet<>(list3) );
        System.out.println(list3.get( 0 ));  //min num

    }
}
