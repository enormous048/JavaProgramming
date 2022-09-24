package Day26_CustomMethod_Practice;

public class FrequencyOfElements {

    public static int frequencyOfElement(int[] arr, int num ){

        int count = 0;
        for (int i : arr) {
            if (i == num){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(char[] arr, char ch ){

        char count = 0;
        for (char i : arr) {
            if (i == ch){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(double[] arr, double num ){

        int count = 0;
        for (double i : arr) {
            if (i == num){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(String[] arr, String str ){

        int count = 0;
        for (String i : arr) {
            if (i == str){
                count++;
            }
        }
        return count;

    }

}
