package Day50_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable_Intro {
    public static void main(String[] args) {
        //All Collection classes inherit Iterable methods: hasNext()


        //ітератор зроблений тому що видаляти з коллекшину проблематично в лупах

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,4,5,6,7,8,9));

        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i)<5){
                list.remove( list.get(i) );
            }
        }//not working



//============================================================


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,4,5,6,7,8,9));

        Iterator<Integer> it = list2.iterator();
        boolean b = it.hasNext();       //тру якшо кожного разу є елемент
        System.out.println( it.next() );//1

        boolean b2 = it.hasNext();     //тру якшо кожного разу є новий елемент (коли дійде до кінця листа то вибє фолс)
        System.out.println( it.next() );//2

        while (it.hasNext()){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(list2);


        //=====================================================

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,4,5,6,7,8,9));

        for (Iterator<Integer> it2 = list3.iterator(); it2.hasNext();){ //збільшення в самій суті методу задано,
            if (it2.next()<5){
                it2.remove();
            }
        }


        // removeIf()   a lot more easy then iterator;
    }
}
