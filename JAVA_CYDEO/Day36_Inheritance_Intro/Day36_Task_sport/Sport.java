package Day36_Inheritance_Intro.Day36_Task_sport;

public class Sport {
    public String name, rules;
    public int numberOfPlayers, numberOfReferre;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                '}';
    }
}
