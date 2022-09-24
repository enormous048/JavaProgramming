package Day39_Inheritance_Encapsulation.statesTask;

public class Texas extends States{
    private boolean hasAustin;


    public Texas(String abbreviation, String politicalParty, String governor, String senator, int population, int stateTaxRate, boolean hasAustin) {
        super("Texas", abbreviation, politicalParty, governor, senator, population, stateTaxRate);
        setHasAustin(hasAustin);
    }

    public boolean isHasAustin() {
        return hasAustin;
    }

    public void setHasAustin(boolean hasAustin) {
        this.hasAustin = hasAustin;
    }

    @Override
    public String toString() {
        return "Texas{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTaxRate=" + getStateTaxRate()+
                ", hasAustin=" + hasAustin +
                '}';
    }
}
