package Day36_Inheritance_Intro.Day36_Task_sport;

public class Football extends Sport{

    public Football(String name, String rules, int numberOfPlayers, int numberOfReferre){
        super(name, rules, numberOfPlayers, numberOfReferre);
    }

    public void pass(){
        System.out.println("You are passing the ball to next player");
    }
}
