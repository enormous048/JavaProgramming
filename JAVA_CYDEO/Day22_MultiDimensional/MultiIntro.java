package Day22_MultiDimensional;

import java.util.Arrays;

public class MultiIntro {
    public static void main(String[] args) {
        String[] group1 = {"Naz", "Andriy", "Sam"};

        String[][] groups = new String[5][]; //In the first brackets we specify how many 1darrays will be
        groups[0] = group1; //Giving the value to array at index 0 in parent array

        System.out.println(Arrays.toString(groups));// toString() method is for 1 dimensional arrays and it will return hashcode in multidimensional

        System.out.println( Arrays.deepToString(groups)); // for multi dimensional



        //if we know what values should be in multidimensional arrays then we can declare them
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(arr[0][1]); //output 2
                          // first brecket - index of 1d arrays;  second bracket - index of elements
    }
}
