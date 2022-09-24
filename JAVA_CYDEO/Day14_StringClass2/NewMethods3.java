package Day14_StringClass2;

public class NewMethods3 {
    public static void main(String[] args) {
        //substring(begin index, ending index);

        String word = "Naz Kovalchuk";
        String newWord = word.substring(0, 2+1); //but ending index will always be excluded so we need to add one index more
        //якшо ввести просто нуль чи любе інше число то воно виведе все що після того числа до кінця лапок.
        System.out.println(newWord);
        
        
        String java = "Java Programming Language";
        
        String subJava1 = java.substring(0, java.indexOf(" "));
        String subJava2 = java.substring(java.indexOf(" ") + 1, java.lastIndexOf(" "));
        String subJava3 = java.substring(java.lastIndexOf(" ")+1);


        System.out.println(java);
        System.out.println("subJava1 = " + subJava1);
        System.out.println("subJava2 = " + subJava2);
        System.out.println("subJava3 = " + subJava3);

    }
}
