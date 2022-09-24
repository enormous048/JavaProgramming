package Day38_Inheritance_Overriding.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gender) {
        super(name, jobTitle, comapnyName, age, id, salary, gender);
    }

    public void work(){
        System.out.println(name + " is fixing bugs.");
    }
}
