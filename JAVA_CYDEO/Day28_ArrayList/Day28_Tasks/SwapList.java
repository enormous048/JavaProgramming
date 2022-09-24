package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class SwapList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(5);
        numbers.add(111);
        
        int first = numbers.get(0);
        int last = numbers.get(numbers.size()-1);
        
        numbers.set(0, last);
        numbers.set(numbers.size()-1, first);

        System.out.println("numbers = " + numbers);
    }
}
