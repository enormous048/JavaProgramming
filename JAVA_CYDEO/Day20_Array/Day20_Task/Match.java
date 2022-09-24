package Day20_Array.Day20_Task;

public class Match {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        String result = "";


        for (int i = 0; i <= arr1.length-1; i++) {

            for (int j = 0; j <= arr2.length-1; j++) {
                if (arr1[i] == arr2[j]){
                    result += arr1[i] + " ";
                }
            }
        }
        System.out.println(result);



    }
}
