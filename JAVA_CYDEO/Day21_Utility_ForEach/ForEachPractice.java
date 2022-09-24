package Day21_Utility_ForEach;

public class ForEachPractice {
    public static void main(String[] args) {

        int[] nums = {4, 5, 7, 8, 94, 4, 444};
        int max = nums[0];

        for (int i : nums) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
