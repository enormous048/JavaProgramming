package Day48_Collection;

public class Collection {
    //Collection is a group of objects stored in single entity.
    //List, Queue, Set are child interfaces of Collection interface. So all child/grandchild inherit Collection methods.

/*

          Collection (I): dynamic sized
                          ready methods
                          for non-primitives ONLY


                     List (I): duplicates are allowed, has index number

                          ArrayList (C):  searching/accessing elements is faster.
                          LinkedList (C): insertion /deletion of the element is faster
                          Vector (C):     is Synhcronized ==> thread-safe
                          Stack (C):      is Synhcronized ==> thread-safe. pop() ===> LIFO


                     Set (I): duplicates are not allowed, does not have index number (Навіть ті сети які зберігають ордер, все одно не мають індекса)

                          HashSet (C):      Maintains random order. Fastest
                          LinkedHashSet(C): Maintains insertion order
                          TreeSet (C):      Maintains sorted order, does not accept null


                     Queue (I): duplicates are allowed, does not have index number. poll() ===> FIFO

                          PriorityQueue(C): Maintains random order
                          ArrayDequeue (C): Maintains insertion order
                          LinkedList (C):   Maintains insertion order. also has poll()

 */
}
