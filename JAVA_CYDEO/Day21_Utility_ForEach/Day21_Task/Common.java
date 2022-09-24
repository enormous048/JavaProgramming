package Day21_Utility_ForEach.Day21_Task;

public class Common {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 7};
        int[] arr2 = {2, 5, 4, 7};
        String result = "";

        for (int i : arr) { //цей луп створюєм шоб зафіксувати певний айтем в першому

            for (int j : arr2) { // цей луп створюєм шоб порівняти цей айтем з усіма іншими
                if (i == j){  //тут не треба arr[i] робити бо сама веріабл в фор іч лупі репрезентує айтеми
                    result += i + " ";

                }
            }

        }
        System.out.println(result);
    }
}
