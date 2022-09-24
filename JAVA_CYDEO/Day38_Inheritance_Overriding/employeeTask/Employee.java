package Day38_Inheritance_Overriding.employeeTask;

public class Employee {
    public String  name, jobTitle, comapnyName;
    public int age, id, salary;
    public char gender;

    public Employee(String name, String jobTitle, String comapnyName, int age, int id, int salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.comapnyName = comapnyName;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " " + jobTitle + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", comapnyName='" + comapnyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
