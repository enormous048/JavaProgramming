package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperM {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList("Masha", "Dasha", "Huyasha", "Naz", "Mia", "Mario"));

        arrList.removeIf(p -> p.startsWith("M"));//removeAll не вийде бо ми по кондишину видаляєм а не по обьєктах
        //for each element p in arrList - remove element if condition

        String[] arr = arrList.toArray(new String[0]);
        System.out.println("arr = " +Arrays.toString(arr));

    }
}
