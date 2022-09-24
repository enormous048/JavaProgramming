package Day49_Collection_Practice;

import java.util.*;

public class List_Set {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50));
        list.addAll(Arrays.asList(10,20,30,40,50));
        list.addAll(Arrays.asList(10,20,30,40,50));
        list.addAll(Arrays.asList(10,20,30,40,50));
        list.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(list.get(4));
        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(10,20,30,40,50));
        set.addAll(Arrays.asList(10,20,30,40,50));
        set.addAll(Arrays.asList(10,20,30,40,50));
        set.addAll(Arrays.asList(10,20,30,40,50));
        set.addAll(Arrays.asList(10,20,30,40,50));
        set.addAll(Arrays.asList(null,null,null));


        //System.out.println(set.get(4));
        System.out.println(set);


        Set<Integer> setTree = new TreeSet<>();
        setTree.addAll(Arrays.asList(60,10,20,30,40,50));
        setTree.addAll(Arrays.asList(60,10,20,30,40,50));
        setTree.addAll(Arrays.asList(60,10,20,30,40,50));
        setTree.addAll(Arrays.asList(60,10,20,30,40,50));
        setTree.addAll(Arrays.asList(60,10,20,30,40,50));

        System.out.println(setTree);
        //TreeSet doesn't accept null because it uses object methods, and these methods have nullpointer exception
        



        
        
    }
}
