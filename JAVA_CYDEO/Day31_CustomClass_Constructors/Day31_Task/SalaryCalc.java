package Day31_CustomClass_Constructors.Day31_Task;

public class SalaryCalc {
    int hourlyRate;
    int stateTaxRate;
    int federalTaxRate;
    int weeklyHours;

    public SalaryCalc(int hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public int salary(){
        return hourlyRate * weeklyHours * 4;
    }
    public int stateTax(){
        return (salary() * stateTaxRate) / 100;
    }
    public int federalTax(){
        return (salary() * federalTaxRate) / 100;
    }
    public int salaryAfterTax(){
        return salary() - (stateTax()+federalTax());
    }

    public String toString() {
        return "SalaryCalc{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

    /*
    1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */

}
