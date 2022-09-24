package Day31_CustomClass_Constructors;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount banjObj = new BankAccount();
        banjObj.balance = 1000;
        System.out.println(banjObj.balance);

        banjObj.deposit(230);
        System.out.println(banjObj.balance);


    }
}
