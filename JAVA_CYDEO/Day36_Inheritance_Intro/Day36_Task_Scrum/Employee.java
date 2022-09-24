package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class Employee extends Person{
    protected int id, salary;
    protected String jobTitle;

    public Employee(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender);
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name + " is working.");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
