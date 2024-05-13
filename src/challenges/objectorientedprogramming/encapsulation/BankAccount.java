package challenges.objectorientedprogramming.encapsulation;

public class BankAccount {

    private double balance;
    private long accountNumber;
    private String ownerName;

    public BankAccount(String ownerName) {
        this.balance = 0;
        this.accountNumber = 54562154589765487L;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return "You have introduced " + amount + " RON.";
        } else {
            return "The amount must be greater than 0.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return "Withdrawal of " + amount + " RON successful.";
        } else {
            return "Invalid withdrawal amount or insufficient funds.";
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Gica Hagi");
        System.out.println("Account Owner: " + account.getOwnerName());
        System.out.println("Account Number: " + account.getAccountNumber());

        account.deposit(1000);
        account.withdraw(500.0021);
        System.out.println("Current Balance: " + account.getBalance());
    }
}