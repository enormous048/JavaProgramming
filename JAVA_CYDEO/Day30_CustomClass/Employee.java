package Day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
