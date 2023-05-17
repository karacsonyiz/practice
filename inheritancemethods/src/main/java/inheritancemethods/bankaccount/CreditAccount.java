package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {

    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        if (amount + costOfTransaction(amount) > super.getBalance() + overdraftLimit) {return false;}
        if (super.getBalance() - amount - costOfTransaction(amount) < 0 ) {
            this.overdraftLimit = (super.getBalance() + overdraftLimit) - (amount + costOfTransaction(amount));
            super.setBalance(0);
            return true;
        }
        super.setBalance(super.getBalance() - amount - costOfTransaction(amount));
        return true;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
