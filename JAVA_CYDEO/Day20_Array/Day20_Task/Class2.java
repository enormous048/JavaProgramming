package Day20_Array.Day20_Task;

public class Class2 {
    public static void main(String[] args) {

        String[] classmates = {"Naz Kovalchuk", "Marichka Bashak", "Yana Pylat", "Maria Diakovych", "Roman Levashov"};
        String result = "";


        for (int i = 0; i <= classmates.length-1; i++) {

            String mate = "";
            for (int j = classmates[i].length()-1; j >= 0; j--) {
                mate += classmates[i].charAt(j);
            }

            result += "\n" + mate;
        }
        System.out.println(result);
    }
}
