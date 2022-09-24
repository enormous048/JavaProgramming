package Day29_ArrayList_CollectionClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {
        //We can't use remove() in loop, because collection is dynamic structure and every time something is removed
        //the index numbers also change, so remove method will keep deleting but from wrong indexes

        ArrayList <Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrList.removeIf( p -> p % 2 == 0);//p represents every element in array (lambda)
        //removeIf - implicitly uses Iterable interface and internally iterates arrList

        System.out.println("arrList = " + arrList);




        ArrayList <String> arrList2 = new ArrayList<>();
        arrList2.addAll(Arrays.asList("Java", "C#", "C++", "Ruby", "Python", "JavaScript"));

        arrList2.removeIf( each -> each.toLowerCase().startsWith("j"));
        System.out.println("arrList2 = " + arrList2);



        ArrayList <String> arrList3 = new ArrayList<>();
        arrList3.addAll(Arrays.asList("Anna", "Level", "Eye", "Ruby", "Python", "JavaScript"));

        arrList3.removeIf( each -> !StringUtility.isPalindrome(each) );
        System.out.println("arrList3 = " + arrList3);


        // remove()    - removes 1 element, DO NOT use in loop
        // removeAll() - when you want to remove multiple elements (або можна поставити один елемент і видалить всі зразу а не по одному)
        // retainAll() - when we want to retain(зберегти) certain elements
        // removeIf()  - when we have condition to remove( can use in loop )

    }
}
