package Day31_CustomClass_Constructors;

public class BankAccount {
    public String holder;
    public int accNumber;
    public int balance;

    public void checkBalance(){
        System.out.println("balance = " + balance);
    }

    public void deposit(int sum){
        if (sum<=0){
            System.out.println("Depositing amount cannot be zero or negative number");
            return;
        }
        balance += sum;
    }
    public void withdrawal(int sum){
        if (balance<=0){
            System.out.println("You can't withdrawal because you don't have means in your account");
            return;
        }
        balance -= sum;
    }
}
