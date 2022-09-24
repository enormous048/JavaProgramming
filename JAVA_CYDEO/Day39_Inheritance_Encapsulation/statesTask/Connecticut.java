package Day39_Inheritance_Encapsulation.statesTask;

public class Connecticut extends States{

    private boolean hasNorwalk;


    public Connecticut(String abbreviation, String politicalParty, String governor, String senator, int population, int stateTaxRate, boolean hasNorwalk) {
        super("Connecticut", abbreviation, politicalParty, governor, senator, population, stateTaxRate);
        setHasNorwalk(hasNorwalk);
    }

    public boolean isHasNorwalk() {
        return hasNorwalk;
    }

    public void setHasNorwalk(boolean hasNorwalk) {
        this.hasNorwalk = hasNorwalk;
    }

    @Override
    public String toString() {
        return "Connecticut{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTaxRate=" + getStateTaxRate()+
                ", hasNorwalk=" + hasNorwalk +
                '}';
    }
}
