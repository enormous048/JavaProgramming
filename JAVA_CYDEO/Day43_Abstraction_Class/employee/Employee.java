package Day43_Abstraction_Class.employee;

public abstract class Employee extends Person{

    private int id, salary;
    private String jobTitle;

    public Employee(String name, int age, char gender, int id,  String jobTitle, int salary) {
        super(name, age, gender);
        setSalary(salary);
        setId(id);
        setJobTitle(jobTitle);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0){
            throw new RuntimeException("Invalid id");
        }
        this.id = id;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()){
            throw new RuntimeException("Invalid title");
        }
        this.jobTitle = jobTitle;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<=0){
            throw new RuntimeException("Invalid salary");
        }
        this.salary = salary;
    }

    public abstract void work(); //focus on essantials, gives details later

    /*
    @Override
    public abstract void eat();*/   //воно вже заінхеритолсь тому не треба оверрайдити, оверрайдиш вже в чайлд файнал класах

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", gender=" + getGender() +
                ", id=" + id +
                '}';
    }
}
