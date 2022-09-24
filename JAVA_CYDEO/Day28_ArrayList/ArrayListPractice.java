package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList < Integer > num = new ArrayList<>();
        num.add(10);
        num.add(2);
        num.add(8);
        num.add(3);

        for (int i = 0; i <= num.size()-1; i++) {
            num.set(i, num.get(i) *2);
        }
        System.out.println("num = " + num);

        int index = 0;
        for (Integer each : num) {
            num.set(index, each*2);
            index++;
        }



        ArrayList < Integer > num2 = new ArrayList<>();
        num.add(10);
        num.add(2);
        num.add(8);
        num.add(3);

        int index1 = 1;
        num.remove(index1); //if primitive type then it removes by index

        Integer obj = 2000;
        num.remove(obj); //if not primitive it removes by object

        //і якшо видаляєм по нон прімітів то можемо запихнути в булін і дізнатись чи був обєкт видалений
        boolean b = num.remove(obj); //returns false if this object doesn't exist so it can't be removed
        System.out.println("b = " + b);


        //Bulk operations
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,23,4,4,5,6,77));


        
        
    }
}
