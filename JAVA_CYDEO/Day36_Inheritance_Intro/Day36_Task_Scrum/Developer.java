package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void coding(){
        System.out.println(name +" is coding.");
    }
}
