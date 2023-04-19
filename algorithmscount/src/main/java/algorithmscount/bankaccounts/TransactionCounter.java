package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactionList, int amount){
        int counter = 0;
        for(Transaction t : transactionList){
            if(t.isCredit() && t.getAmount() < amount){
                counter += 1;
            }
        }
        return counter;
    }
}
