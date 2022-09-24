package Day48_Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue_Intro {
    public static void main(String[] args) {
        //Queue(I):
        // *Duplicates allowed
        // *Order not preserved
        // *Doesn't have index number
        // *First in First out ( .poll() method )

        //There aren't use cases, but for interview its good to know.



        PriorityQueue<Integer> pr = new PriorityQueue<>();
        //Random order. Doesn't have index numbers.


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        //Preserved insertion order. Doesn't have index numbers.


        LinkedList<Integer> list = new LinkedList<>();
        //When you want all abilities of List(index numbers and so on), but also .poll() method.








    }
}
