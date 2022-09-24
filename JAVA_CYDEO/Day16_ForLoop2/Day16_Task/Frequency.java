package Day16_ForLoop2.Day16_Task;

public class Frequency {

    public static void main(String[] args) {
        String str = ("Java Java Java").toLowerCase();
        String result = "";

        int count = 0;

        for (int i = 0; i <= str.length()-4; i++) {


            result = str.substring(i, i+4); //кожну ітерацію воно стирається і тому каунт не буде всі рази додавати а лише тоді коли стрінг джава буде
            if (result.equals("java")){
                count++;
            }

        }
        System.out.println("Java appears " + count + " times!");
    }
}
