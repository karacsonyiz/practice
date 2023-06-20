package algorithmssum.transactions;

public class Transaction {

    private final TransactionOperation operation;
    private final int amount;

    public Transaction(TransactionOperation operation, int amount) {
        this.operation = operation;
        this.amount = amount;
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
