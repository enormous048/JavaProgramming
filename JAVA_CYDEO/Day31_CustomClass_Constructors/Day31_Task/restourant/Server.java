package Day31_CustomClass_Constructors.Day31_Task.restourant;

public class Server {
    private String name;
    private int employeeID, hourlyRate;
    private boolean fullTime;

    public Server(String name, int employeeID, int hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

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
        return fullTime;
    }

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
        if (hourlyRate <= 0){
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String fullTime(){
        String result = (fullTime == true)?"full-time" :"part-time";
        return result;
    }
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime/parttime=" + fullTime()+
                '}';
    }
}
