package Day31_CustomClass_Constructors.Day31_Task.restourant;

public class Chef {
    private String name;
    private int employeeID, hourlyRate;
    private boolean isFullTime;

    public Chef(String name, int employeeID, int hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }

    //getters
    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<= 0){
            return;
        }
        this.employeeID = employeeID;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0){
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    //Methods
    public String fullTime(){
        String result = (isFullTime == true)?"full-time" :"part-time";
        return result;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ",FullTime/PartTime=" + fullTime() +
                '}';
    }
}
