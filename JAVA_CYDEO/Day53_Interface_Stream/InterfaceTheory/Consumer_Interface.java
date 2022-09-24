package Day53_Interface_Stream.InterfaceTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
    public static void main(String[] args) {

        //Consumer - takes any value in parameter and does not return a value.
        //  void accept(T t);


        Consumer<String> printEach = (str) -> {
            for (String s : str.split("")) {
                System.out.println(s);
            }
        };
        printEach.accept("Naz Kovalchuk");




        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer integer : list) {
            if (integer%2 != 0){
                System.out.println(integer);
            }
        }

        list.forEach( p -> {  //фор іч підставляє кожен елемент листа в цей параметр
            if (p%2 !=0) {
                System.out.println(p);
            }
        }
        );
        //for each метод витягає кожен елемент з листа, і підставляє його в  p -> p
        //for each method uses consumer functional interface


        //-----------------------------------------------------------------

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Naz Kovalchuk", "Max Butsik", "Andrew Ardan"));

        names.forEach( (c) -> {  //фор іч підставляє кожен елемент листа в цей параметр

            System.out.println(c.charAt(0) +"." + c.substring( c.lastIndexOf(" ")+1, c.lastIndexOf(" ")+2));

        } );


    }
}
