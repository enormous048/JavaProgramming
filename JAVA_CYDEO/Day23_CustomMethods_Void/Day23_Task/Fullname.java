package Day23_CustomMethods_Void.Day23_Task;

public class Fullname {


    public static void fullName(String first, String second){

        String firstName= first.charAt(0)+"".toUpperCase() +first.substring(1).toLowerCase();
        String secondName= second.charAt(0)+"".toUpperCase()+ second.substring(1).toLowerCase();

        System.out.println(firstName +" " + secondName);

    }


    public static void main(String[] args) {

        fullName("NaZ", "KOValChUk");



    }
}
