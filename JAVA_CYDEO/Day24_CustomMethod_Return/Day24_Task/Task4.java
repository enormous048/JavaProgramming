package Day24_CustomMethod_Return.Day24_Task;

public class Task4 {

    public static int freakOfNum(int[] arr, int num){

        int count = 0;

        for (int i : arr) {
            if (i == num){
                count++;
            }
        }

        return count;


    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,2,2,5,5,67};
        int num = 2;

        int freak = freakOfNum(nums, num);

        System.out.println(freak);
        if (freak != 1){
            System.out.println(num + " is not unique.");
        }else {
            System.out.println(num + " is unique");
        }
    }
}
