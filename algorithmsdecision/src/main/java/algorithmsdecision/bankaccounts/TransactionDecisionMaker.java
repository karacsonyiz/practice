package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

        public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime,LocalDateTime endTime, int amount){
            for (Transaction transaction : transactions){
                if (transaction.getAmount() > amount && isBetween(transaction.getDateOfTransaction(),startTime,endTime) && transaction.isDebit()){
                    return true;
                }
            }
            return false;
        }

        public boolean isBetween(LocalDateTime timeOfTransaction,LocalDateTime startTime, LocalDateTime endTime){
            return timeOfTransaction.isAfter(startTime) && timeOfTransaction.isBefore(endTime);
        }

}
