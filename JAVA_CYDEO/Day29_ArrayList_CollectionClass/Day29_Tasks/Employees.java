package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {

    public static void main(String[] args) {


        String[] arr = {"Naz", "Marushka", "Bitch", "Andrew", "Max", "Danya", "Yarik"};

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        arrList.retainAll(Arrays.asList("Naz", "Marushka"));

        arr = arrList.toArray(new String[0]);

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
