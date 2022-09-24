package Day7_Operators;

public class UnaryOperators {

    // +    int a = +5;  //арифметікал оператори це коли ти додаєш два числа а ці унарі це інше
    // -    int a = -5;
    // ++
    //--
    public static void main(String[] args) {
        int a = 6;
        ++a; // outputs 7
        //pre increment:increases the value by 1 immediately


        int b = 6;
        b++;//outputs 6
        //post increment: first passes the current value than increases by 1
        //(in the next step: for example when we print b nextly after first print), but firstly gives default number
    }

}
