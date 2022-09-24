package Day36_Inheritance_Intro.Day36_Task_Scrum;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        /*create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
        Create 4 objects of Testers
        Create 5 Objects of Developers

        Create an object of ScrumTeam

        Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team*/

        ProductOwner owner = new ProductOwner("Naz", 18, 'M', 7, 130000, "ProductOwner");

        ScrumMaster master = new ScrumMaster("Fred", 29, 'M', 8, 100000, "Scrum");

        BusinessAnalyst analyst = new BusinessAnalyst("Bella", 22, 'F', 9, 900000, "Business exec.");

        Tester tester1 = new Tester("Bran", 39, 'M', 10, 120000, "SDET");

        Tester tester2 = new Tester("Clair", 26, 'F', 11, 110000, "SDET");

        Developer dev1 = new Developer("Dod", 89, 'M', 12, 80000, "Dev");

        Developer dev2 = new Developer("Bi", 46, 'F', 13, 85000, "Dev");



        ScrumTeam team = new ScrumTeam();
        team.PO = owner.name;
        team.BA = analyst.name;
        team.SM = master.name;

        team.testers.addAll(Arrays.asList(tester1, tester2));
        team.developers.addAll(Arrays.asList(dev1, dev2));


        System.out.println(team);


    }
}
