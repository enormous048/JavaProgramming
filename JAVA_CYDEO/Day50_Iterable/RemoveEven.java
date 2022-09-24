package Day50_Iterable;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>( Arrays.asList(1,2,3,4,5,6,7,8,9) );


        //Predicate is boolean expression
        /*
        set.removeIf(each -> {
            return each % 2 == 0;
        });
        */

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            if (it.next() % 2 ==0){   //it.next() репрезентує певний елемент з set
                it.remove();
            }
        }
        System.out.println(set);



    }
}
