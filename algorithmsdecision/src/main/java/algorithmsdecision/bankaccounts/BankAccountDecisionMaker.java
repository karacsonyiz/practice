package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min){
        for(BankAccount acc : accounts){
            if(acc.getBalance() > min){
                return true;
            }
        }
        return false;
    }
}
