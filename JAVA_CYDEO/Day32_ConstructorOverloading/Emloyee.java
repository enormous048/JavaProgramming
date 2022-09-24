package Day32_ConstructorOverloading;

public class Emloyee {
    //constructor overloading allows us to have multiple choices when creating object

    public String name;
    public char gender;
    public String jobTitle;
    public int salary;


    public Emloyee(String name, char gender, String jobTitle, int salary){
        this(name, gender, jobTitle);//Aka  this.name = name; this.gender = gender; this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public Emloyee(String name, char gender, String jobTitle){
        this(name, gender); //Aka  this.name = name; this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public  Emloyee(String name, char gender){
        this(name); //Aka   this.name = name;
        this.gender = gender;
    }

    public  Emloyee(String name){
        this.name = name;
    }

    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
