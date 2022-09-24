package Day26_CustomMethod_Practice;

import utilities.ArrayUtility;

public class Merge2_0 {

    public static int[] merge2(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr1.length];

        for (int i : arr1) {
            result = ArrayUtility.addAfterLast(result, i); //в методі адафтерЛаст створюється новий еррей обьєкт, тому ми заново ініціалізуєм
        }
        for (int i : arr2) {
            result = ArrayUtility.addAfterLast(result, i);
        }
        return result;

    }
}
