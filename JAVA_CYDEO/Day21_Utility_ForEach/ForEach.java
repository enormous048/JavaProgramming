package Day21_Utility_ForEach;

public class ForEach {
    public static void main(String[] args) {

        // for each loop is totally dependent on data structure, it will finish when reaches the last item in data structure

        //The iteration order starts from very first item and we cannot start it from last item.

        int[] nums = {1,2,4,6,7,5,4};

        for (int i = 0; i <= nums.length-1; i++) {
            System.out.println(nums[i]);
        }

        for (int i : nums){
            System.out.println(i);
        }

    }
}
