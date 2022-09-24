package Day39_Inheritance_Encapsulation.person;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+ " " + getJobTitle() + " is smoke testing.");
    }

}
