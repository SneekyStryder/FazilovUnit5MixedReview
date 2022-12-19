public class BankAccount {
    private double balance;
    private double totalDeposited;
    private int totalDeposits;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        totalDeposited += amount;
        totalDeposits++;
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double averageDeposit() {
        return totalDeposited / totalDeposits;
    }

}
