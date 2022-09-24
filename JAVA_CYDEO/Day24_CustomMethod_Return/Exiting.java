package Day24_CustomMethod_Return;

public class Exiting {
    public static void myMethod(int day){

        if (day < 1 || day > 7){
            return; // exits the method rigth away, so it doesnt need to check next statements
                    //in void you can only use it for exiting and cannot pass a value
        }

        if (day == 1){
            System.out.println("Monday");
        } // so on..




        // continue;  can use only in loop - skips iteration;
        // break;    can use in loop or switch - stops loop or switch
        // System.exit(0);  exits entire program
        // return;   works in void, and exits method - next statements after return; won't be executed

    }
}
