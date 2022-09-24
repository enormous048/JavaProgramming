package Day35_OOP_Encapsulation.Day35_Task2;

public class BankAcc {
    private String accountHolder;
    private int accountNumber, balance;



    public void deposit(int deposit){
        balance += deposit;
    }
    public void withdraw(int withdraw){
        balance -= withdraw;
    }

    public BankAcc(String accountHolder, int accountNumber, int balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }


    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0){
            System.out.println("Invalid account");
            return;
        }
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        if (balance <= 0){
            System.out.println("Invalid balance");
            return;
        }
        this.balance = balance;
    }


    public String toString() {
        return "BankAcc{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
