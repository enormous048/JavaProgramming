package Day55_LastTopics;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        //Reduction stream operations allow us to produce one single result from a sequence of elements

        //Identity – an element that is the initial value of the reduction operation and
        //the default result if the stream is empty

        //Accumulator – a function that takes two parameters:
        //*a partial result of the reduction operation
        //*the next element of the data structure


        // stream().reduce( identity, (previous_result, next_element) -> previous_result * next_element);

        // Перша ітерація:
        // - в паршил резалт вставляється ідентіті (1 в нашому випадку)
        // - в некст елемент вставляється перший елемент датастракчер
        // Результат: нічого не змінилось бо 1 * на перший елемент верне перший елемент

        // Подальші ітерації:
        // - в паршил резалт вставляється результат минулої ітерації
        // - в некст елемент вставляється наступний елемент датастракчер
        // Результат: резалт першої ітерації множиться на наступний елемент датастракчер(1*перший елемент  * другий елемент )



        //На то шо в дужках лямбди не дивись, дивись на імплементацію і представляй:
        //-На першій ітерації разулт це "" а некст елемент це перший елемент еррею і тд.
        String[] arr = {"Java", "Python", "Ruby", "PHP", "C#"};
        String strCombined = Arrays.stream(arr).reduce("", (result, nextElement) -> result +" "+nextElement );
        strCombined = strCombined.trim();
        System.out.println("strCombined = " + strCombined);


        int[] arr2 = {2,3,4,5,6,7};
        int multiplicationOfAll = Arrays.stream(arr2).reduce(1, (result, nextElement)-> result*nextElement);
        System.out.println("multiplicationOfAll = " + multiplicationOfAll);

    }
}
