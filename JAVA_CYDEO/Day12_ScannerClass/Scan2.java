package Day12_ScannerClass;

import java.util.Scanner;

public class Scan2 {

    public static void main(String[] args) {


        /**
        new Scanner(System.in).nextInt();
        //якшо не запихнути це в веріабл обьєкта то сканер не буде реюзабл і лише один раз можна буде використати інпуn.
        //наприклад зараз шоб новий інпут зчитати треба знов робити:

        new Scanner(System.in).nextDouble();
        //а так можна би було просто обэктом швидко викликати myObj.nextInt();

        **/

        Scanner myObj = new Scanner(System.in);

        byte a = (byte) myObj.nextInt(); //теж можна тайп кестінг робити
        System.out.println(a);


        System.out.println("Enter true or false");
        boolean trueOrFalse = myObj.nextBoolean(); //приймає з юзерінпуту тільки слова тру ор фолс



        String name = myObj.next(); //String method does not read the whole line just till the space
                                    //типу якшо введу своє імя і прізвище то хіба імя прочитає і запринтує хіба імя

        String name1 = myObj.nextLine(); //String input that reads the whole line
    }
}
