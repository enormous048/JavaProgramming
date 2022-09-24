package Day38_Inheritance_Overriding.employeeTask;

public class Pilot extends Employee{

    public Pilot(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gender) {
        super(name, jobTitle, comapnyName, age, id, salary, gender);
    }

    public void work(){
        System.out.println(name + " is flying over Madrid.");
    }

}
