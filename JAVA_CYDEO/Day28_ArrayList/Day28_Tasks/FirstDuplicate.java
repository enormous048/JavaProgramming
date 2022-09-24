package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class FirstDuplicate {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(7);
        numbers.add(6);
        numbers.add(6);
        numbers.add(5);
        numbers.add(5);
        numbers.add(111);

        int count = 0;
        for (Integer i : numbers) {
            for (Integer j : numbers) {

                if (i == j){
                    count++;
                }

            }
            if (count >= 2) {
                System.out.println("number duplicate= " + i);
                break;
            }

        }



    }
}
