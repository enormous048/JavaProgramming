package Day46_Polymorphism;

import Day36_Inheritance_Intro.Day36_Task_Scrum.*;
import Day43_Abstraction_Class.shape.Sphere;
import Day43_Abstraction_Class.shape.Square;
import Day44_Abstraction_Interface.warmup.Parrot;
import Day44_Abstraction_Interface.warmup.Playable;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphysmIntro {

    //Ability of objects to take many forms. Without inheritance you won't have polymorphism

    //Polymorphism occurs when reference type is parent class/interface, and object type is child class

    //reference_type    reference_name   =   object_type

    //Юз кейс - я зробив методи мепу і в параметр ставив меп а не лінкед чи хеш мепи, зекономило багато часу.

    //For reference name give some general name, because object types can be different everytime
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        Integer n = 42;

        Boolean b = true;

        Character ch = 'M';


        Object[] arr = {str, n, b, ch, new Square(3), new Sphere("Sphere", 4)};




        //Employee or Person could be reference type to these childs
        Employee owner = new ProductOwner("Naz", 18, 'M', 7, 130000, "ProductOwner");

        Employee master = new ScrumMaster("Fred", 29, 'M', 8, 100000, "Scrum");

        Employee analyst = new BusinessAnalyst("Bella", 22, 'F', 9, 900000, "Business exec.");

        Employee tester1 = new Tester("Bran", 39, 'M', 10, 120000, "SDET");

        Employee dev1 = new Developer("Dod", 89, 'M', 12, 80000, "Dev");


        //ONLY possible when there is IS A relations
        //Developer d = new Tester("Bran", 39, 'M', 10, 120000, "SDET");


        ArrayList<Employee> companyEmployees = new ArrayList<>(Arrays.asList(owner, master, analyst, tester1, dev1));
        //тепер перент клас можна юзати щоб зберігати в одному місці різні сабкласи.

        for (Employee employee : companyEmployees) {
            System.out.println(employee);
        }



        System.out.println("------------------------------------------------------");



        Employee emp = new Tester("Bran", 39, 'M', 10, 120000, "SDET");
        emp.work();
        //імплементація цього методу залежить від обьєкта, якшо в обьєкті інша імплементація ніж в референсі то вибє імплементацію обьєкта

        //emp.smoketest();  not available
        //Доступні лише методи і філди з референс тайп класу, і в разі якшо вони були оверриден то вибє імплементацію з чайлд класу


        Playable animal = new Parrot("UFO", "white", 11, 'M', "Kesha");
        animal.play();
        //animal.eat();   все те саме як і зверху є і в інтерфейсі, якшо інтерфейс має якись метод то він буде доступний, але імплементація буде з чайлд класу
        //animal.drink();


        /*
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new OperaDriver();

        driver1.get(chrome);  //імплементація гет методу буде залежати від того який оверрайд є в обьєкті
        driver2.get(opera);


        Animal an = new Dog();
        an.drink();  //якшо в дог класі не оверрайдився, вибє імплементацію з перент класу
        */
    }
}
