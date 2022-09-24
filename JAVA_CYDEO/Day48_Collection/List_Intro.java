package Day48_Collection;


import java.util.*;

public class List_Intro {
    public static void main(String[] args) {
        // List(I):
        // *has index numbers. (Collection don't have get() method, so it means not all classes of Collection have index number);
        // *duplications are allowed.
        // *insertion order preserved

        //You can't create object of List because it's an Interface, but you could use Polymorphism.
        //Все таки поліморфізм норм штука, наприклад я не хочу вказувати новий референс тайп для кожного класу Листа - так легше просто.


        List<Integer> list = new ArrayList<>();
        //Internally uses array.
        //The process of Accessing elements is faster.

        List<Integer> list2 = new LinkedList<>();
        //Internally uses doubly linked list, that means each value has pointer to next and previous value.
        //The process Inserting and Deleting elements is faster.

        List<Integer> list3 = new Vector<>();
        //Internally uses array. Is Synchronised (Thread-safe). Safer but Slower.

        List<Integer> list4 = new Stack<>();
        //Child of Vector so is synchronised too. Last in first out order.


        //Короче всі вони одинакові по суті, просто мають свої внутрішні невидимі особливості.



        list4.addAll(Arrays.asList(1,2,3,45,6));
        int element = (int) ((Stack)list4).pop(); //removes last object and returns this object (LIFO)
        System.out.println(element);
        System.out.println(list4);




    }
}
