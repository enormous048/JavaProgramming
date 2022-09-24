package Day13_StringClass;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        //1. .charAt(index)  -- returns character from the specific index of string
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstname = scan.next();
        System.out.println("Enter last name: ");
        String lastname = scan.next();

        char first = firstname.charAt(0); //firstname.charAt()   можна зразу в принтл записати але якшо хоч веріабл то створюєш чар
        char last = lastname.charAt(0);

        String initials = first + "." + last; //якшо стейтменті інволвед стрінг то зробиться конкатенація, без тої крапки вибє помилку бо фирст і ласт то чари.
        System.out.println(initials);


        //2.  .length()  -- returns how many characters are int the string(as int), але повертає не номери індекса, а по нормальному від 1 починаючи

        char lastchar  = lastname.charAt( lastname.length() - 1 ); //відмінусни від ленгсу 1 шоб дістати останнє велью під індексом
        System.out.println(lastchar);                              //^ це формула щоб найти останній чар під останнім індексом  (чар ет по суті по індексу виводить нам якись чар в стрінгу)

       //це те саме що зверху чар ет просто всередині замість номеру індексу формула для виводу останнього чару в стрінзі




        //3. .toLowerCase()   -  make everything in lower case
        //   .toUpperCase()   - make evrithing in upper case


        String str = "wooden spoon";
        str = str.toUpperCase();  //якшо ми заново не ініціалізуєм стрінг стр  то воно не стане аппер кейсом бо стрінг іммютабл
                                  //якшо заново не ініціалізувати то в принті при виводі стр і далі буде стрінг в ловеркейсі

    }
}