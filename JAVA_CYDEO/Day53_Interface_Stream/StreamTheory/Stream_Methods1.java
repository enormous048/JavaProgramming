package Day53_Interface_Stream.StreamTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Methods1 {
    public static void main(String[] args) {
        //After calling the stream() function from ONLY an Array or List  we can access to methods of stream.



        //stream().distinct()  -  removes dublicates from Collection type or array
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,6,77,7,7,7,8));
        list = list.stream().distinct().collect(Collectors.toList());

        //stream() does not change the data structure, so in order to reassign we have:
        //collect( Collectors.toList() )  -- now we can reassign it to list.



        int[] arr = {1,2,2,3,3,4,5,6,77,7,7,7,8};
        //arr.stream();  Array itself doesnt have strem method, but Arrays utility has.
        arr = Arrays.stream(arr).distinct().toArray();
        //Similar to list stream does not change the array, so you need to reassign it with toArray();

        System.out.println(Arrays.toString(arr));



        //skip()  -  skips the given number of elements
        list = list.stream().skip(5).collect(Collectors.toList());  //removes first five elements (0-4 indexes)
        arr = Arrays.stream(arr).skip(4).toArray();



        //limit()  -  limits the size of array or collection
        list = list.stream().limit(6).collect(Collectors.toList()); //any elements after the six's element(or after 0-5) will be removed



        //map()  -  if you wanna somehow modify elements. Accepts Function lambda expression
        list = list.stream().map( p -> { return p*10;  } ).collect(Collectors.toList());
        //for each p in list = p*10  можна так читати

        //оцей меп файний метод бо раніше я не міг через ремув іф ітерувати

        //якшо лямбда всередині методу находиться то не треба після курлі брейсес ставити крпкуз комою



    }
}
