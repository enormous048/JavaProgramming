package Day26_CustomMethod_Practice;

import utilities.ArrayUtility;

public class ReturnUnique {

    public static String[] uniqueElements(String[] arr){

        String[] result = {};//якшо не знаєш довжини ні елеметів то пустий еррей декларуєш



        for (int i = 0; i <= arr.length-1; i++) {//зафіксовуєм кожен елемент

            if ( ArrayUtility.frequencyOfElement(arr, arr[i]) == 1) { //якшо він лише один такий в ерреї то запихається в резулт
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }
        }
        return result;
    }
}
