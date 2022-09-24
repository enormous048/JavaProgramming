package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class MultiplyOdd {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int index = 0;
        for (Integer num : nums) {
            if (num % 2 != 0){
                nums.set(index, num*2);
            }
            index++;
        }
        System.out.println("nums = " + nums);


    }
}
