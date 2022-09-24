package Day18_NestedLoops.Day18_Task;

public class Table {

    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {


            System.out.println();
            for (int j = 1; j <= 10; j++) {
                result = j * i;

                if (String.valueOf(result).length() == 2){
                    System.out.print(result+ "     ");
                }
                else {System.out.print( (result)+"      ");}
            }
        }

    }

}
