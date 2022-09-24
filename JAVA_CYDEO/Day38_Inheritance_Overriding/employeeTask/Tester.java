package Day38_Inheritance_Overriding.employeeTask;

public class Tester extends Employee{

    public int yearsOfExp;

    public Tester(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gender, int yearsOfExp) {
        super(name, jobTitle, comapnyName, age, id, salary, gender);
        this.yearsOfExp = yearsOfExp;
    }

    public void work(){
        System.out.println(name + " is smoke testing");
    }


}
