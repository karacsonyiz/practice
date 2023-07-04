package bank;

import java.util.List;

public class Bank {

    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void deposit(String accountNumber, int amount) {
        boolean found = false;
        for(Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber)){
                account.deposit(amount);
                found = true;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Account number can not be empty!") ;
        }
    }
}
