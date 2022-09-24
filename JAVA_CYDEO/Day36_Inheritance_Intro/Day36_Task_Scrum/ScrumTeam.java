package Day36_Inheritance_Intro.Day36_Task_Scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {


    public String PO, BA, SM;
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testers.removeIf(p-> p.id == id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p-> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
