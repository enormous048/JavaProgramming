package Day21_Utility_ForEach;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[] ar1 = {1, 2, 3};
        int[] ar2 = {4, 5};

        int[] arrayRes = new int[ar1.length+ ar2.length];

        int index = 0; //надаєм індекс шоб можна було запихати під правильним номером.
        for (int i : ar1){
            arrayRes[index] = i; //запихає три велью
            index++;
        }

        for (int j : ar2){
            arrayRes[index] = j; //запихає 2 велью бо індекс памятає скільки вже було заповнено
            index++;
        }
        //кожен луп репрезентує собою вель з свого еррею.

        System.out.println(Arrays.toString(arrayRes));


    }
}
