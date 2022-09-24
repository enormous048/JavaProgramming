package Day8_IfStatement;

public class LogicalOperators {
    public static void Eligibility() {


        String person = "Naz";
        int age = 18;
        int creditScore = 800;
        String country = "Ukraine";

        boolean isEligible = age >= 18 && country == "USA" && creditScore >= 800;
        //1. AND operator - обидва(або більше) стейтменти мають бути правильними щоб було true, якшо хочаб одне неправильне то вибє фолс
        System.out.println(person + " is eligible: " + isEligible);
    }


    public static void Eligibility2() {
        //2. OR operator якщо хочаб одне з них правильне то вибє true

        String name2 = "Lily";
        int age2 = 42;
        char gender = 'F';

        boolean isEligible2 = age2 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name2 + " is eligible: " + isEligible2);

    }

    public static void main(String[] args) {
        //3. OPPOSITE
        boolean age3 = !(18 > 18); //поверне тру навіть якщо це фолс

        System.out.println(age3);
    }

}
