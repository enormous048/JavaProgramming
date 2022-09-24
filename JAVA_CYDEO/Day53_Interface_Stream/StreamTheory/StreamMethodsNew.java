package Day53_Interface_Stream.StreamTheory;
import static java.util.stream.IntStream.of;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.*;


public class StreamMethodsNew {
    public static void main(String[] args) {

        // With boxed()  you can convert primitive int array to List.  boxed конвертує тільки в Лист. Еррейллист недоступний
        int[] a = {12,3,4,5,6};
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(listA);

        // With mapToInt()  you can convert List to primitive int Array
        int[] b = listA.stream().mapToInt(p-> p).toArray();
        System.out.println(Arrays.toString(b));



        // sum() -  returns the integer sum of all elements ONLY of array only if its primitive datatype array

        //Завдяки верхнім методам тут тепер можна конвертнути спочатку еррей Інтежер в Лист,
        //і далі лист в примітив інт еррей з мепТуІнт() методом.
        int[] arr = {1,2,3,4,5,6,7};
        int result = Arrays.stream(arr).map(x -> x * x).sum();



        // min()  and  max()  -  returns min and max value but as OptionalInt class.
        // To convert it to int use getAsInt() method
        int maxNum =  Arrays.stream(arr).max().getAsInt();
        int minNum = Arrays.stream(arr).min().getAsInt();



        //collect(Collectors.joining()); - returns a Collector that concatenates the input elements into a String, in encounter order
        String[] arr2 = {"Naz", "naz"};
        String join = Arrays.stream(arr2).collect(Collectors.joining(" "));
        //в джойнінг можна запхати якись чарсіквенс і він буде між кожними джойнами



        // of(arr)  -  скоріший спосіб шоб викликати стрім з еррею
        int i = of(arr).sum() - of(arr).max().getAsInt() - of(arr).min().getAsInt();
        int i2 = Arrays.stream(arr).sum() - Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();

        //For integers
        IntStream.of(1,2,3,4,5,6,7).sum();
        //Ця штука працює тільки з ерреями, бо стрім листа визивається через крапку, а тут вставляєш еррей в стрім метод

        //For stings
        Stream.of("string".split("")).count();



        //Anagram check with stream:

        //- sorted()  --  sorts data structure
        //- equals()  --  returns boolean if one datastructure equals another
        Stream.of("string".toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of("ogirinla".toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.joining()));






        // avarage()  - returns avarage number
        int avarage =(int) Arrays.stream(arr).average().getAsDouble();




        // IntStream.rangeClosed( begin, end )   --  returns array or list of elements  emulating loop.
        //То то саме якщо пролупити від 1 до 9 в лупі та вставляти 'і' в датастракчер
        IntStream.rangeClosed(1, 9).toArray();

        LongStream.rangeClosed(1, 8).toArray();

        //DoubleStream.of(arr).sum();




        //mapToDouble()  -  Consumer interface returns value in double;
        Arrays.stream( IntStream.rangeClosed(0, 4).toArray() ).mapToDouble(p->  Math.pow(2, p)).toArray();




        //Effectively final - means you can make temporal variable for another variable that changes every time(loop);
    }
}

