package Day10_Ternaries.Day10_Task;

public class Loan {
    public static void main(String[] args) {

        int salary = 50000;
        int credit = 750;

        String result = (salary > 60000 && credit > 650)? "Loan approved" : "Loan denied";
        System.out.println(result);


    }

}
