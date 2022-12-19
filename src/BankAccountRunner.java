public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10.50);
        account.withdraw(7);
        account.deposit(15);
        System.out.println(account.getBalance());  // SHOULD PRINT 18.5
        System.out.println(account.averageDeposit());  // SHOULD PRINT 12.75
    }
}
