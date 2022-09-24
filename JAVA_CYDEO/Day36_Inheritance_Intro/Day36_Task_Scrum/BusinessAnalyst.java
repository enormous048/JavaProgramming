package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void analise(){
        System.out.println(name +" is analising");
    }
}
