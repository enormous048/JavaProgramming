package Day39_Inheritance_Encapsulation.statesTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population, stateTaxRate;


    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, int stateTaxRate) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTaxRate(stateTaxRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            return;
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isEmpty()){
            return;
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty()){
            return;
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty()){
            return;
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty()){
            return;
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0){
            return;
        }
        this.population = population;
    }

    public int getStateTaxRate() {
        return stateTaxRate;
    }

    public void setStateTaxRate(int stateTaxRate) {
        if (stateTaxRate<=0){
            return;
        }
        this.stateTaxRate = stateTaxRate;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTaxRate=" + stateTaxRate +
                '}';
    }
}
