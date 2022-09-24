package Day21_Utility_ForEach;

public class Unique {
    public static void main(String[] args) {

        String[] names = {"Naz", "Marushka", "Naz", "Naz"} ;


        for (String elementOne : names) { //fixating on first element

            int count = 0;
            for (String elementAll : names) { // comparing first element with all

                if (elementAll.equals(elementOne)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(elementOne + " is unique item.");
            }
        }
    }
}
