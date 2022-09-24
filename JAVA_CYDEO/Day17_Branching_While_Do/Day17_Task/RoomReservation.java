package Day17_Branching_While_Do.Day17_Task;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to book a room?");
        String booking = scan.next().toLowerCase();

        while (!booking.equals("yes") && !booking.equals("no")){
            System.out.println("Enter a valid response:");
            scan.next().toLowerCase();
        }

        if (booking.equals("yes")){
            System.out.println("Which type of room you want to reserve?");

            scan.nextLine();
            String typeRoom = scan.nextLine();
            while ( !(typeRoom.equalsIgnoreCase("King Bed") ) && !( typeRoom.equalsIgnoreCase("Queen Bed") ) && !(typeRoom.equalsIgnoreCase("Single Bed")) ){

                System.out.println("Provide a valid type:");
                typeRoom = scan.nextLine();
            }
            typeRoom = typeRoom.equalsIgnoreCase("King Bed")? "King bed ==> 150$" :typeRoom.equalsIgnoreCase("Queen Bed")? "Queen Bed ==> 120" : "Single Bed ==> 100$";
            System.out.println(typeRoom);




        } else if (booking.equals("no")) {
            System.out.println("Have a nice day!");
        }


    }
}
