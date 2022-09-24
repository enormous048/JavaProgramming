package Day21_Utility_ForEach;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtility {
    public static void main(String[] args) {

        // toString() - makes array to string.
        // При принті стрінгу цей метод викликається імплиситлі але для еррею його треба самому визивати


        // sort()  sorts the array in ascending order , так само в стрінгах в порядку аскі тейбл
        Integer[] array = {3, 8, 6, 99, 1};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());  //this overloaded version is possible only for object type



        // equals(array1, array2) -- якшо всі індекси і всі велью в індексах збігаються то вибє тру
        int[] one = {1, 2, 3};
        int[] two = {1, 3, 2};

        boolean bool = Arrays.equals(one, two);
        System.out.println(bool);
    }
}
