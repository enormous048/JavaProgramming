package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void check(){
        System.out.println(name +" is checking work");
    }
}
