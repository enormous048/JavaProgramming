package Day53_Interface_Stream.StreamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {

        //Write a program that can remove the duplicated elements of an array of String
        String[] arr1 = {"Naz", "Naz", "Naz", "Max", "Max"};
        arr1 = Arrays.stream(arr1).distinct().toArray(String[]::new);
        //when there is non primitive type then toArray() default value is Object[];  To cast put toArray(String[]::new)

        List<String> list = new ArrayList<>(Arrays.asList("Naz", "Naz", "Igor", "Igor", "Max"));
        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println("list = " + list);



        //Write a program that can count how many "java" and "python" does the array has
        String[] array = {"Java", "jAVa", "pythON"};
        long countJava = Arrays.stream(array).filter( (str)-> {return str.equalsIgnoreCase("java");} ).count();
        long countPython = Arrays.stream(array).filter( (str)-> {return str.equalsIgnoreCase("python");}).count();
                                      //for each str in array retain str that matches with python



        //Write a program that can count how many negative numbers does the array has
        int[] arr2 = {-5,-7,-5,1,2,3,4,5};
        long countNegatives = Arrays.stream(arr2).filter( (i)-> { return i<0; }).count();
                              //for each i in array retain i that is negative


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,-5,-6,-9));
        long countNefativesInList = list2.stream().filter( (i)-> {return i<0; }).count();
                                      //for each i in list retain i that is negative
        System.out.println("countNefativesInList = " + countNefativesInList);



        //Wirte a program that can return all the negative numbers of the array as a new array
        int[] arr3 = {-5,-7,-5,1,2,3,-4,5};
        int[] newArr3 = Arrays.stream(arr3).filter( (i)-> {return i<0;} ).toArray();
                           // for each int i in arr3 retain i that is negative
        System.out.println(Arrays.toString(newArr3));


        //Wirte a program that can return all the negative numbers of List without the duplcaites
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,-5,-9,-6,-5,-6,-9));
        list3 = list3.stream().filter( (i)-> {return i<0;} ).distinct().collect(Collectors.toList());
                  // for each int i in list3 retain i that is negative
        System.out.println("list3 = " + list3);


        //Wirte a program that can return the palindrome Strings from a list:
        List<String> list4 = new ArrayList<>(Arrays.asList("eye", "lol", "pylyp", "radar"));
        list4 = list4.stream().filter( (str)->{
            String reversed = "";
            for (int i = str.length()-1; i>=0; i--){
                reversed+= str.charAt(i);
            }
            return str.equalsIgnoreCase(reversed);
        } ).collect(Collectors.toList());
        // for each str in list4 retain str that is palindrome

        // filter() стирає всі шо не співпадають
        // map()  не стирає а просто модифікує певні елементи або модифікує всі елементи




        //Write a program that can return the unique elements of an array as a new array:
        final Integer[] arr = {1,1,2,3,3,4,5,5,6};//2,4,6
        Integer[] arrNew = Arrays.stream(arr).filter( (i)-> {

            boolean isUnique = false;

            if (Collections.frequency( Arrays.asList(arr), i ) == 1) {
                isUnique = true;
            }
            return isUnique;

        } ).toArray(Integer[]::new);
        // for each int i in arr, retain i that is unique
        System.out.println(Arrays.toString(arrNew));

    }
}
