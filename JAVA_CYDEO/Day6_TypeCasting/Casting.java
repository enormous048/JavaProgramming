package Day6_TypeCasting;

public class Casting {

    // double > float > long > int > short > byte


    public static void main(String[] args) {
        //Implicit casting is when we convert smaller to bigger and it is done automatically
        int a = 123;
        double b = a;
        // (double) a   -- it is what happens in the background of compiler



        //Explicit casting is when we convert bigger types to smaller - not automatically
        int aa = 345;
        byte bb = (byte) aa; // (ставиш мишку після двокрапки) alt + Enter   -  шорткат який визиває меню виправлення помилок в Інтеллідж

        //але якшо кастити від інт до байт якшо той інт більший за 128, то в принті вибє максимальне 128(або менше рандом) а не то більше число
        System.out.println(bb);


        double myNum = 10.7;
        short numMY = (byte) myNum; //це не буде помилкою




        //if one of the numbers is decimal the result will be in decimal
        // int a = 10 / 3;  outputs 3
        // double a = 10 / 3;  outputs 3.0 because two values are integers not decimals
        // double a = 10.0 / 3;  outputs 3.333333  because at least one number is decimal
    }
}
