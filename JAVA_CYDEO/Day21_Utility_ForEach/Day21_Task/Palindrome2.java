package Day21_Utility_ForEach.Day21_Task;

public class Palindrome2 {
    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};
        int count = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            String pal = ""; //ініціалізуєм тут щоб заново можна було паліндроми запихати

            for (int j = arr[i].length()-1; j >= 0; j--) {

                pal += arr[i].charAt(j); // "anna".charAt(j)  ..
            }
            if (pal.equals(arr[i])){
                count++;
            }
        }

        System.out.println(count);

    }
}
