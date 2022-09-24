package Day5_Concatenation;

public class FlightTicket {
    public static void main(String[] args) {

        String name = "Naz",
                surname = "Kovalchuk",
                city = "Drohobych";  //declared 3 variables within the same datatype
        String address = name + "\n" + surname + "\n" +city; // escape sequence works only with double quotes
        System.out.println(address);



        String from = "Las Vegas";
        String to = "McLean";
        double price = 13.5;

        System.out.println("From " + from + " to " + to + " costs " + price + " euros");
    }


    //Якшо ти додаєш інтежер до стрінгу в принті то це вже конкатенація
    //(0 + "" + 0 + "" 0) - ці три нуля не стануть одним нулем адже вони не знаходять поряд один з одним а будуть конкатуватись до стрінг
}
