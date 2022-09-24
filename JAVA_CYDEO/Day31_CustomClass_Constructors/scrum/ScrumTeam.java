package Day31_CustomClass_Constructors.scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PO, SM, BA;
    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();


    //Constructor
    public ScrumTeam(String PO, String SM, String BA) {
        setPO(PO);
        setSM(SM);
        setBA(BA);
    }

    //getters
    public String getPO() {
        return PO;
    }

    public String getSM() {
        return SM;
    }

    public String getBA() {
        return BA;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    //Setters
    public void setPO(String PO) {
        this.PO = PO;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }


    //Methods
    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }


    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(int id){
        testers.removeIf( p-> p.getEmployeeId() == id);
    }
    public void removeDeveloper(int id){
        developers.removeIf(p-> p.getEmployeeId() == id);
    }



    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", BA='" + BA + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
