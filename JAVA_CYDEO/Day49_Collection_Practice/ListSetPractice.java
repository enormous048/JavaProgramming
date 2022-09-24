package Day49_Collection_Practice;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,8,8,88,8,9,9,9,9,9,9));

        System.out.println( new ArrayList<>( set ).get(4) );


        List<Integer> list = new Stack<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ( (Stack)list ).pop();
        System.out.println(list);


        ( (LinkedList)list ).poll();
        System.out.println(list);



    }
}
