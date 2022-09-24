package Day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertToArray {
    public static void main(String[] args) {

        String[] countries = {"Ukraine", "Turkey", "United States", "United Kingdom"};

        //converting array to ArrayList
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(countries));
        arrList.removeIf(p -> p.length()>10);


        //converting ArrayList to array(або лупом можна ше)
        countries = arrList.toArray(new String[0]); //цей нуль зміниться залежно від довжини еррейлисту,
                                                    // по суті там ми вказуєм довжину як і при створенні звичайного еррею


    }
}
