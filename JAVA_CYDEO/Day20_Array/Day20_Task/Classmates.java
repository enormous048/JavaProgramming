package Day20_Array.Day20_Task;

public class Classmates {
    public static void main(String[] args) {


        String[] classmates = {"Naz Kobalchuk", "Marichka Bashak", "Yana Pylat", "Maria Diakovych", "Roman Levashov"};
        String result = "";


        for (int i = 0; i <= classmates.length-1; i++) {
            result +="\n" + classmates[i].charAt(0) +". "+classmates[i].substring( classmates[i].indexOf(" ")+1, classmates[i].indexOf(" ")+2 );
        }
        System.out.println(result);
    }
}
