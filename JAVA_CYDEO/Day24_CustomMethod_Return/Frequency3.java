package Day24_CustomMethod_Return;

public class Frequency3 {

    public static int frequencyOfChars(String str, char ch){
        int result = 0;


        char[] arr = str.toCharArray();
        for (int i = 0; i <= arr.length-1; i++) {
            if (ch == arr[i]){ //порівнює певний чар з усіма чарами в чар-ерреї
                result++;
            }
        }

        return result;



    }


    public static void main(String[] args) {

        String str = "hhhskkaoosos";

        for (int i = 0; i < str.length()-1; i++) {
            int countOfChars = frequencyOfChars(str, str.charAt(i)); //кожного разу пропихає нові чари з стрінгу які вже в методі порівнюються

            if (countOfChars == 1){ //реюзаєм щоб дізнатись юнікнесс
                System.out.println(str.charAt(i) + " is unique char" );
            }else {
                System.out.println(str.charAt(i) + " is not unique char");
            }
        }



    }
}
