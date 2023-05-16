package inheritancemethods.bankaccount;

public class DebitAccount {

        private String accountNumber;
        private long balance;
        private static final double COST = 3.0;
        private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {
        long transactionCost = (long) (amount * COST) / 100;
        return transactionCost < MIN_COST ? MIN_COST : transactionCost;
    }

    public boolean transaction(long amount) {
        if (amount + costOfTransaction(amount) <= balance) {
            balance = balance - amount - costOfTransaction(amount);
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
}
