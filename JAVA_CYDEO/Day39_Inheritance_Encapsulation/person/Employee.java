package Day39_Inheritance_Encapsulation.person;

public class Employee extends Person{

    private int id;
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, int salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0){
            return;
        }
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()){
            return;
        }
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name =" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
