package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;

public class Transaction {

    private final String accountNumber;
    private final TransactionOperation transactionOperation;
    private final int amount;
    private final LocalDateTime dateOfTransaction;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public boolean isCredit(){
        return transactionOperation.name().equals("CREDIT");
    }

    public boolean isDebit(){
        return transactionOperation.name().equals("DEBIT");
    }
}


