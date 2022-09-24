package Day38_Inheritance_Overriding.employeeTask;

public class Teacher extends Employee{


    public Teacher(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gender) {
        super(name, jobTitle, comapnyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching children");
    }
}
