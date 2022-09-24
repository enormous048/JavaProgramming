package Day9_MultiBranch_If.Day9_Task;

public class Tax1_0 {
    public static void main(String[] args) {
        int salaryBeforeTax = 89000;
        int salaryAfterTax = 0;
        int tax = 0;
        boolean marriage = true;


        if (salaryBeforeTax >= 0 && salaryBeforeTax <= 1_000_000) {
            if (salaryBeforeTax > 100000 && salaryBeforeTax <= 130000) {
                tax = (salaryBeforeTax * 35) / 100;
                salaryAfterTax = salaryBeforeTax - tax;
                System.out.println(salaryAfterTax + " is salary after tax of this family.");


            } else if (salaryBeforeTax > 80000 && salaryBeforeTax <= 100000) {
                tax = (salaryBeforeTax * 30) / 100; //35% посунь кому на дві позиції і вийде > 3.5 > 0.35
                salaryAfterTax = salaryBeforeTax - tax;
                System.out.println(salaryAfterTax + " is salary after tax of this family.");


            } else {
                tax = (salaryBeforeTax * 25) / 100;
                salaryAfterTax = salaryBeforeTax - tax;
                System.out.println(salaryAfterTax + " is salary after tax of this family.");
            }


            if (marriage = true) {
                salaryAfterTax = salaryAfterTax - (salaryBeforeTax * 5 / 100);
                System.out.println(salaryAfterTax + " is salary after tax of married family.");

            }

        }else{
            System.out.println("Conditions are not met");
        }

        //всьо я поняв якшо ти з самого початку не надав велью веріабл і хочеш її потім отримати ззовні від if то вибє еррор,
        //але якшо ти поставиш з самого початку 0 наприклад і далі в if зміниш її то ти вже зможеш отримати її ззовні іф

    }
}
