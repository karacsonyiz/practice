package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccountList, int amount){
        int counter = 0;
        for(BankAccount b : bankAccountList){
            if(b.getBalance() > amount){
                counter += 1;
            }
        }
        return counter;
    }
}
