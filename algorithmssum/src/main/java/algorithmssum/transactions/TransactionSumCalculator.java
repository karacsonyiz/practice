package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactionList){

        int result = 0;
        for(Transaction t : transactionList){
            if (t.isCredit()){
                result += t.getAmount();
            }
        }
        return result;
    }


}
