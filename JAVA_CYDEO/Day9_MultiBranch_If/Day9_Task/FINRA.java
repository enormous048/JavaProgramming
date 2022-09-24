package Day9_MultiBranch_If.Day9_Task;

public class FINRA {
    public static void main(String[] args) {
        int a = 10;
        boolean multiple3 = a % 3 == 0;
        boolean multiple5 = a % 5 == 0;
        boolean multiple3_5 = a % 3 == 0 && a % 5 == 0;


        if (multiple3_5) {
            System.out.println("FINRA");
        }else if(multiple3){
            System.out.println( "FIN");
        }else if (multiple5){
                System.out.println("RA");
        }

    }

}


