package Day36_Inheritance_Intro.Day36_Task_Scrum;

public class ProductOwner extends Employee{


    public ProductOwner(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void think(){
        System.out.println(name +" is smoke thinking");
    }
}
