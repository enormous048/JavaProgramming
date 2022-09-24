package Day39_Inheritance_Encapsulation.person;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+ " " + getJobTitle() + " is fixing bugs.");
    }
}
