package Day38_Inheritance_Overriding.employeeTask;

public class Driver extends Employee{

    public String car;
    public Driver(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gende, String car){
        super(name, jobTitle, comapnyName, age, id, salary, gende);
        this.car = car;
    }

    @Override
    public void work() {
        System.out.println(name + " is driving to New-York");
    }
}
