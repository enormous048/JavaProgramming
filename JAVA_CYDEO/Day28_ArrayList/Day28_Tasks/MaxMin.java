package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class MaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(111);
        
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
            if (min > number){
                min = number;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
    }
}
