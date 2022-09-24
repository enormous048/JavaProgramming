package Day14_StringClass2;

public class NewMethods4 {
    public static void main(String[] args) {
        //repeat()   with this method we can repeat a string as many times as we want


        String str = "hahaha";
        str = str.repeat(4);

        String str2 = str.repeat(14);
        System.out.println(str + "" + str2);



        System.out.println("Naz\n".repeat(16));



        String name = "Naz";
        System.out.print((name + " ").repeat(5));



    }


}
