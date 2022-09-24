package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(arrList, 0, arrList.size()-1);
        System.out.println("arrList = " + arrList);
        



        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.addAll(Arrays.asList(0,34,0,0,0,5,6,783,0,2,2));


        Integer move = 0;
        int count = Collections.frequency(arrList2, move);

        arrList2.removeAll(Arrays.asList(move));
        for (int i = 1; i <= count; i++) {
            arrList2.add(move);
        }
        System.out.println("arrList2 = " + arrList2);
        
    }
}
