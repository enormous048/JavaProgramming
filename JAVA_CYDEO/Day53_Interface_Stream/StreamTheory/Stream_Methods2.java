package Day53_Interface_Stream.StreamTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Methods2 {
    public static void main(String[] args) {


        // filter()  -  if you wanna get some specific elements from array or list. Accepts Predicate

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,6,77,7,7,7,8));
        List<Integer> evenNumbers  = list.stream().filter( p-> p%2==0 ).collect(Collectors.toList());//стирає всі номери шо не є івен




        // count()  -  count how many elements for example are even, mostly used with filter()
        List<String>  names  = new ArrayList<>(Arrays.asList("java", "jAva", "Python"));

        long count  = names.stream().filter(p-> p.equalsIgnoreCase("java")).count(); //counts how many strings java are in list
        //Now it's easier to find the frequency



        // forEach()  - if you wanna iterate elements from a stream. Accepts Consumer lambda expression.
        //фор іч для мепу ексептить бі консюмер
        names.stream().filter(p-> p.equalsIgnoreCase("java")).forEach( p -> p+="something" );//принтує всі джава стрінги з листа



        // allMatch()  -  returns true if every elements in data structure match with condition in Predicate
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,6,77,7,7,7,8));
        boolean allAreEven = list2.stream().allMatch(p-> p%2==0);//якшо всі елемнти в листі аре івен
        //рахуй р як якусь мета веріабл яка репрезентує всі елементи в листі

        // anyMatch()  - returns true if atleast one element match with the condition in Predicate
        boolean someAreEven = list2.stream().anyMatch(p-> p%2==0);//якшо хочаб один елемент в листі є івен

        // noneMatch()  -  returns true if none of the elements matches with the condition in Predicate
        boolean allAreEven2 = list2.stream().noneMatch(p -> p%2!=0); //тру якшо ніякі не є одд
    }
}
