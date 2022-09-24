package Day7_Operators.Day7_Task;

public class Day7_Task {
    //1.write a program that can swipe(поміняти місцями велью) two variables' value by using a temporary variable
    public static void Practice1() {

        int num1 = 13;
        int num2 = 31;
        System.out.println("Before swapping num1 = " +num1 + "; num2 = " + num2);


        int temporary;
        temporary = num1; //запихаєм початкове значення нам1 в темпоралку шоб не загубилось
        num1 = num2;      //нам1 стає нам2
        num2 = temporary; //нам2 бере то велью яке ми запихнули щоб не загубити
        System.out.println("After swapping num1 = "+ num1 + "; num2 = "+ num2);
    }


    //2. Write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false
    public static void Practice2() {
        int year = 2020;
        //ліп єр це коли остача при діленні року на 4 є нульовою -- тоді це високосний рік

        boolean leap = year % 4 == 0;
        System.out.println(year + " is leap? " + leap);
    }


    //3. Calculate the following:

    //1.salaryBeforeTax
    //2. stateTax
    //3. federalTax
    //4. totalTax
    //5. salaryAfterTax
    public static void main(String[] args) {
        int hourlyRate = 15;
        int weekHours = 40;
        int federalTaxRate = 26;
        int stateTaxRate = 6;


        int salaryBeforeTax = hourlyRate * weekHours * 52;
        int federalTax = (salaryBeforeTax * federalTaxRate) / 100; //або просто селері фібор такс помножити на 0.26
        int stateTax = (salaryBeforeTax * stateTaxRate) / 100;
        int totalTax = (salaryBeforeTax  *  (federalTaxRate + stateTaxRate) ) /  100;
        int salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Salary before tax: $" + salaryBeforeTax + "\nTotal tax: $" + totalTax + "\nSalary after tax: $" + salaryAfterTax);

    }

}
