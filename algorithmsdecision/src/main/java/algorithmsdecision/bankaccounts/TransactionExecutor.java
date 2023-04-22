package algorithmsdecision.bankaccounts;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts){
        for(Transaction transaction : transactions){
            for(BankAccount account : accounts){
                if(account.getAccountNumber().equals(transaction.getAccountNumber())){
                        creditOrDebit(transaction,account);
                }
            }
        }
    }

    public boolean creditOrDebit(Transaction transaction, BankAccount account){
        return transaction.isCredit() ? account.deposit(transaction.getAmount()) : account.withdraw(transaction.getAmount());
    }
}
