package Day43_Abstraction_Class.employee;

public final class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+ " " + getJobTitle() + " is teaching children.");
    }

    public void eat(){
        System.out.println(getName()+ " eats healthy food.");
    }
}
