package bank2;

public class Account {

    private final String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null) {
            throw new IllegalArgumentException("Account number can not be empty!") ;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract < 0) {
            throw new InvalidAmountBankOperationException("Invalid Amount!",ErrorCode.INVALID_AMOUNT);
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if(amount > balance) {
            throw new LowBalanceBankOperationException("Low Balance!",ErrorCode.LOW_BALANCE);
        }
        if(amount < 0) {
            throw new InvalidAmountBankOperationException("Invalid Amount!",ErrorCode.INVALID_AMOUNT);
        }
        this.balance = this.balance - amount;
        return this.balance;
    }

    public double deposit(double amount) {
        if(amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid Amount!",ErrorCode.INVALID_AMOUNT);
        }
        this.balance = this.balance + amount;
        return this.balance;
    }
}
