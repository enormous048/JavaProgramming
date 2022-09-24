package Day14_StringClass2;

public class NewMethods5 {
    public static void main(String[] args) {
        // isEmpty()  показує чи стрінг емпті і виводить тру якщо емпті
        String str = " ";

        boolean n = str.isEmpty();//джава підказує збоку який ретурн тайп має бути, коли вибираєш метод зі списку
        System.out.println(n);


        // isBlank()   якшо керектерів нема то виводить тру, але якщо є спейс то теж виведе тру;
                                                           // But isEmpty() виведе фолс навіть якшо буде спейс
        boolean n2 = str.isBlank();
        System.out.println(n2);


        // equalsIgnoreCase()   те сома шо звичайни іквалс але тут навіть якщо стрінги різні кейси букв мають то це нема значення



        // contains("Java")     outputs true or false according to presence of certain character or group of characters in String
        String str2 = "I love Java";
        boolean n3 = str2.contains("Java");
        boolean n4 = str2.toLowerCase().contains("java");  //таким чином можна перевірити чи контейнить навіть якщо слово в аппері



        // startsWith()
        String a = "Java";
        boolean start = a.toLowerCase().startsWith("ja"); //true

        // endsWith()
        String b = "Java";
        boolean end = a.toLowerCase().endsWith("va");

    }
}
