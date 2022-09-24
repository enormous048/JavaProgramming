package Day31_CustomClass_Constructors.scrum;

import java.util.Arrays;

public class ScrumMain {

    public static void main(String[] args) {
        Tester tester = new Tester("Naz", 777777);
        Tester tester1 = new Tester("Andre", 888888);
        Tester tester2 = new Tester("Ben", 999999);
        Tester tester3 = new Tester("Anton", 333333);

        Developer developer = new Developer("Naz", 777777);
        Developer developer1 = new Developer("Andre", 888888);
        Developer developer2 = new Developer("Ben", 999999);
        Developer developer3 = new Developer("Anton", 333333);
        
        
        ScrumTeam team = new ScrumTeam("Elon", "Steve", "Jeff");
        
        Tester[] arr = {tester, tester2, tester3, tester1};
        team.addTesters(arr);

        Developer[] arr2 = {developer, developer2, developer3, developer1};
        team.addDevelopers(arr2);


        for (Tester eachTester : team.getTesters()) {
            System.out.println(eachTester.getName() +"  "+ eachTester.getEmployeeId());
        }

        for (Developer eachDeveloper : team.getDevelopers()) {
            System.out.println(eachDeveloper.getName() +"  "+ eachDeveloper.getEmployeeId());
        }


        team.removeTester(888888);
        team.removeDeveloper(777777);
        System.out.println("------------------------------------------");


        for (Tester eachTester : team.getTesters()) {
            System.out.println(eachTester.getName() +"  "+ eachTester.getEmployeeId());
        }
        for (Developer eachDeveloper : team.getDevelopers()) {
            System.out.println(eachDeveloper.getName() +"  "+ eachDeveloper.getEmployeeId());
        }

    }
}
