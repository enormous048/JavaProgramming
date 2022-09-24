package Day36_Inheritance_Intro.Day36_Task_sport;

public class Basketball extends Sport{


    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferre){
        super(name, rules, numberOfPlayers, numberOfReferre);
    }

    public void throwBall(){
        System.out.println("You are throwing the ball into the basket");
    }

}
