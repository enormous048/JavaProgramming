package Day13_StringClass.Day13_Task;

import java.util.Scanner;

public class TravelHard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double costAmount = 0;
        String result = "";

        System.out.println("Do you have a passport? (Yes/No)");
        String passport = scan.next();

        if (passport.equals("Yes")) {
            scan.nextLine();
            System.out.println("What country are you heading in?");
            String country = scan.nextLine();

            System.out.println("Have many bags do you carry?");
            byte bag = scan.nextByte();

            System.out.println("How many people are going with you?");
            short people = scan.nextShort();

            scan.nextLine();
            System.out.println("Tell the names of all those people: ");
            String peopleName = scan.nextLine();


            costAmount = 1000;


            if( bag > 0 ){
                costAmount += 50 * bag;

            }
            if (people > 0 && people <= 3){
                costAmount -= 100 * people;
            }


            result = "Your ticket is booked to " + country +
                    ". \nWe have charged extra for the "+bag+" bags but you are traveling with "+ peopleName +
                    " \nso we are giving a discount. Your total cost is $"+costAmount+" .";
            System.out.println(result);
            scan.close();





        }else {
            System.out.println( "When your passport expired?");
            int expire = scan.nextInt();

            scan.nextLine();
            System.out.println("Which country do you plan to travel?");
            String countryTwo = scan.nextLine();

            System.out.println("Will you be travelling next year?");
            String nextyear = scan.next();

            costAmount = 200;
            int yearsOfExpire = 2022 - expire;


            if (expire != 2022){
                costAmount += 75 * yearsOfExpire; //if треба бо якшо введе 2022 то вийде 0 і вся ціна стане нулем.

            }else {
                costAmount += 75;
            }


            if (nextyear.equals("Yes")){
                costAmount += 100;

            }else {
                costAmount -= 50;
            }


            result = "Looks like your password has been expired for "+yearsOfExpire+
                    ", \nbut not to worry we will get it ready for you to travel to "+countryTwo+
                    ". \nYour total cost has come out to $"+costAmount+".";
            System.out.println(result);
            scan.close();

        }
    }
}
