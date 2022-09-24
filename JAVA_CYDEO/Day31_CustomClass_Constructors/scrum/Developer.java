package Day31_CustomClass_Constructors.scrum;

public class Developer {
    private String name;
    private int employeeId;




    public void coding(){
        System.out.println(name + " is coding.");
    }

    public Developer(String name, int employeeId) {
        setName(name);
        setEmployeeId(employeeId);
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
        if (employeeId<=0){
            System.out.println("Employee id cannot be zero or negative");
            return;
        }
        this.employeeId = employeeId;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
