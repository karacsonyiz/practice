package algorithmscount.bankaccounts;

public class Transaction {

    private String accountNumber;
    private TransactionType operation;
    private int amount;

    public Transaction(String accountNumber, TransactionType operation, int amount) {
        this.accountNumber = accountNumber;
        this.operation = operation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isCredit() {
        return operation.name().equals("CREDIT");
    }

    public boolean isDebit() {
        return operation.name().equals("DEBIT");
    }

    public int getAmount() {
        return amount;
    }


}
