package Day9_MultiBranch_If.Day9_Task;

public class Tax2_0 {
    public static void main(String[] args) {
        double taxRate = 0;
        boolean isMarried = true;
        double salaryBeforeTax = 60000;
        double salaryAfterTax = 0;

        if (salaryBeforeTax >= 100000 && salaryBeforeTax <= 130000){
            taxRate = 0.35;
        }else if (salaryBeforeTax >= 80000 && salaryBeforeTax <= 100000){
            taxRate = 0.30;
        }else if (salaryBeforeTax >= 60000 && salaryBeforeTax <= 80000){
            taxRate = 0.25;
        }else {
            taxRate = 0.20;
        }

        if (isMarried){
            taxRate -= 0.05; //віднімаєм 5 процентів від того шо ініціалізовано вверху.
        }

        salaryAfterTax = salaryBeforeTax - (salaryBeforeTax * taxRate);
        System.out.println("Salary before tax = " + salaryBeforeTax );
        System.out.println("Salary after tax = " + salaryAfterTax);


    }
}
