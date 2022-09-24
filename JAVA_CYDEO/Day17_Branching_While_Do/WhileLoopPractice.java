package Day17_Branching_While_Do;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void mainOne(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String proposal = scan.next().toLowerCase();

        while ( !(proposal.equals("yes") || proposal.equals("no")) ){
            System.out.println("Enter a real answer");
            proposal = scan.next().toLowerCase();
        }

        if (proposal.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Sorry bro");
        }


        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scan.next();
        System.out.println("Enter password");
        String password = scan.next();




        if (username.equals("Cydeo") && password.equals("Zopiro_90")){
            System.out.println("Successful login.");

        }else {
            int attemts = 3;
            while ( !(username.equals("Cydeo") && password.equals("Zopiro_90")) && attemts > 0) {
                System.out.println("You have " + attemts + " attempts left.");
                System.out.println();


                System.out.println("Enter username");
                username = scan.next();
                System.out.println("Enter password");
                password = scan.next();
                attemts--;

            }//Програма не прочитає то шо нижче допоки луп не закриється
            if (username.equals("Cydeo") && password.equals("Zopiro_90")){
                System.out.println("Successful login.");
            }else {
                System.out.println("Login is not approved.");
            }
            scan.close();
        }
    }
}
//Ми не знаєм на якому аттемпті юзер відповість правильно, якби брали фор луп то навіть якшо юзер відповів правильо на 2 аттемпті
//то воно б все рівно третій раз крутило б луп.