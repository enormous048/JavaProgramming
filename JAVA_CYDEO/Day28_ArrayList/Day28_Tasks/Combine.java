package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class Combine {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i : arr1) {
            result.add(i);
        }
        for (int i : arr2) {
            result.add(i);
        }
        System.out.println("result = " + result);

        
    }
    
    
}
