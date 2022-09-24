package Day24_CustomMethod_Return.Day24_Task;

public class Task1 {

    public static String removeDublicates(String str){

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            if (!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static int maxArr(int[] arr){

        int max = arr[0];
        for (int each : arr) {
            if (max < each){
                max = each;
            }
        }
        return max;

    }

    public static int minArr(int[] arr){

        int min = arr[0];
        for (int each : arr) {
            if (min > each){
                min = each;
            }
        }
        return min;

    }
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];

        int index = 0;
        for (int i : arr1) {
            result[index] = i;
            index++;
        }

        for (int i : arr2) {
            result[index] = i;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        String newStr = removeDublicates("aaaavvganistan");
        System.out.println(newStr);


        int[] arrayFirst = {1,2,3,4,5,6};
        int[] arraySecond = {6,7,99,0,0,};

        int[] newArray = mergeArr(arrayFirst, arraySecond);
        for (int i = newArray.length-1; i >= 0; i--) {
            System.out.print(newArray[i] + "  ");
        }

    }
}
