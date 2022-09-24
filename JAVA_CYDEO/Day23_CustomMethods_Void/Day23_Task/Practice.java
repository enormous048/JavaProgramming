package Day23_CustomMethods_Void.Day23_Task;

public class Practice {

    public static void eachChar(String str){

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void eachElement(int[] arr){
        for (int each : arr) {
            System.out.println(each);
        }
    }



    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,5,6,6,99};

        eachElement(array);

    }
}
