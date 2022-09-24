package Day24_CustomMethod_Return.Day24_Task;

public class Task6 {


    public static boolean isContained(int[] arr, int num){
        boolean result = false;


        for (int i : arr) {
            if (i == num){
                result = true;
                break;
            }else {
                result = false;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {1,3,5,6,7};
        int num = 10;

        boolean numAtArray = isContained(nums, num);
        System.out.println(num +" is in the array? - "+numAtArray);


    }
}
