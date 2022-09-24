package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        // add( data )   -- add data after last element of arraylist
        // add( index, data )  -- insert data to specific index and moves ramaining elements to right side
        ArrayList < String  > names = new ArrayList<>();
        names.add("Naz");       //0
        names.add("Marichka");  //1
        names.add("Marushka");  //3
        names.add("Naz");       //4

        names.add(2, "El Barto");//2


        // set( index, data )  -- replaces the old element with a new, but not inserts like upper
        names.set(0, "Nazar");



        // size() -- tells the size of array - similar to length method
        System.out.println(names.size());
        int lastIndex = names.size()-1;



        // get( index ) -- returns elements from a specific index - similar to array[0]
        String name = names.get(3);
        System.out.println(name);

        for (int i = 0; i <= names.size()-1; i++) {
            System.out.println(names.get(i));
        }
        for (String s : names) {
            System.out.println(s);
        }


        // remove( index ) -- removes element at given index
        // remove( object ) --  remove element by element itself, one element at a time
        names.remove(0);

        names.remove("Naz");


        // clear() - removes everything
        names.clear();


        // indexOf( element ) - returns index of first matching element
        // lastIndexOf( element ) - returns index of first matching element from right side


        //contains( element ) - returns true if element is included in arraylist


        // arraylist1.equals( arraylist2) - returns true if they are the same - similar to Arrays.equals()
        // arraylist1 == arraylist2 - false because they are different objects


        // isEmpty() - returns true if the size is zero




    }
}
