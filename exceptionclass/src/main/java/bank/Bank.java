package bank;

import java.util.List;

public class Bank {

    private final List<Account> accountList;

    public Bank(List<Account> accountList) {
        if(accountList == null) {
            throw new IllegalArgumentException();
        }
        this.accountList = accountList;
    }

    public void deposit(String accountNumber, double amount) {
        boolean found = false;
        for(Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber)){
                account.deposit(amount);
                found = true;
            }
        }
        if(!found) {
            throw new InvalidBankOperationException("Invalid Account number!",ErrorCode.INVALID_ACCOUNTNUMBER) ;
        }
    }

    public void payment(String accountNumber, double amount) {
        boolean found = false;
        for(Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber)){
                account.subtract(amount);
                found = true;
            }
        }
        if(!found) {
            throw new InvalidBankOperationException("Invalid Account number!",ErrorCode.INVALID_ACCOUNTNUMBER) ;
        }
    }
}
