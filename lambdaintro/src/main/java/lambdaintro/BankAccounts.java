package lambdaintro;

import java.util.*;

public class BankAccounts {

    private List<BankAccount> bankAccountList;

    public BankAccounts(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> toSort = new ArrayList<>(bankAccountList);
        Collections.sort(toSort);
        return toSort;
    }

    public List<BankAccount> listBankAccountsByBalance() {

        Comparator<BankAccount> balanceComparator = Comparator.comparing(BankAccount::getBalance);
        List<BankAccount> toSort = new ArrayList<>(bankAccountList);
        toSort.sort(balanceComparator);
        return toSort;
    }


    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> toSort = listBankAccountsByBalance();
        Collections.reverse(toSort);
        return toSort;
    }



    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> toSort = listBankAccountsByBalance();
        toSort.sort(Comparator
                .comparing(BankAccount::getNameOfOwner,Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(BankAccount::getAccountNumber));

        return toSort;
    }

}
