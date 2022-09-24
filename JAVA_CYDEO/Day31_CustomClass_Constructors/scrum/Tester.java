package Day31_CustomClass_Constructors.scrum;

public class Tester {
    private String name;
    private int employeeId;

    public void smokeTesting(){
        System.out.println(name + " is smoke testing.");
    }

    public Tester(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId <=0){
            System.out.println("Employee id cannot be zero or negative");
            return;
        }
        this.employeeId = employeeId;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
