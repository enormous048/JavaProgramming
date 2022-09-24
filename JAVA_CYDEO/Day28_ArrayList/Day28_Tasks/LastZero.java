package Day28_ArrayList.Day28_Tasks;

import java.util.ArrayList;

public class LastZero {
    public static void main(String[] args) {

        ArrayList< Integer > nums = new ArrayList<>();
        nums.add(3);
        nums.add(6);
        nums.add(5);
        nums.add(111);


        nums.set(nums.size()-1, 0);
        System.out.println("nums = " + nums);


    }
}
