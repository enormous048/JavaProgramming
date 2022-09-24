package Day53_Interface_Stream.InterfaceTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicate_Interface {
    //We won't be creating our own functional interfaces later because build in interfaces already exist.

    //Predicate:
    //  boolean test(T t);

    //Яким би не був твій тип параметру вертати має булінку. Takes only one parameter.
    //Завжди маєш дивитись на тип абстракт методу, імплементація в лямбді залежить від нього

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (str) -> {  //закрий очі на цю строку і рахуй це як просто параметр методу
            String reversed = new StringBuilder(str).reverse().toString();

            return str.equalsIgnoreCase(reversed);
        };
        System.out.println(isPalindrome.test("Eye"));


        Predicate<Integer> isEven = (num) ->{
            return num%2 ==0;
        };
        System.out.println(isEven.test(9));

        System.out.println("------------------------------------------------");



        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        list.removeIf( isEven );//removeIf() дістає поступово кожен елемент з листа, а то шо в дужках вже вирішує які саме треба видаляти
                                //походу ремув іф сам підставляє кожен елемент в параметр Предікату шо ми вказали вгорі

        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("mom", "eye", "nazar", "level"));
        list2.removeIf( isPalindrome );
        System.out.println(list2);
    }
}
