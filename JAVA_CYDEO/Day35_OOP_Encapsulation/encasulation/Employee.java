package Day35_OOP_Encapsulation.encasulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private int salary;


    //constructor - to make easier to assign value, just when object is created
    public Employee(String name, char gender, int age, int salary) {
        setName(name); //setName() бо там є кондишин, а в констракторі нема
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    //generate > getter >cntrl check all
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }



    //generate > setter > cntrl checkall
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }
    public void setGender(char gender){
        if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if(age <=0 || age>= 120){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void setSalary(int salary) {
        if( salary <= 0){
            System.out.println("Invalid salary");
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
