package activites;

public class BankAccount {
    private int balance;

    // Create a constructor
    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public int withdraw(int amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }

    public class NotEnoughFundsException extends RuntimeException {

        public NotEnoughFundsException(int amount, int balance) {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }

    }
}
