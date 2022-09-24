package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name +" is smoke testing");
    }
}
