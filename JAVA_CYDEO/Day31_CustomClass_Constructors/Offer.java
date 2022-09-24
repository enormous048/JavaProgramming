package Day31_CustomClass_Constructors;

public class Offer {

    public String companyName;
    public String location;
    public String Jobtitle;
    public int salary;
    public boolean hasBenefit;
    public boolean hasPto;
    public boolean isWfh;
    public boolean isFullTime;

    // pto paid time off when employee is paid and do not work for some time.
    // wfh - work from home
    // sdet - software development engineer in test


    public void setInfo(String companyName, String location, String jobtitle, int salary, boolean hasBenefit, boolean hasPto, boolean isWfh, boolean isFullTime) {
        this.companyName = companyName;
        this.location = location;
        Jobtitle = jobtitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPto = hasPto;
        this.isWfh = isWfh;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", Jobtitle='" + Jobtitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPto=" + hasPto +
                ", isWfh=" + isWfh +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
