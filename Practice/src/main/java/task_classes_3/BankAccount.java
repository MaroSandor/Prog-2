package task_classes_3;

public class BankAccount {
    private String accountNumber;
    private double balance = 0;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Hiba! Nincs fedezet!");
        } else {
        this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount {" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }
}
