package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {

    public static long currentMinValue;
    public static long currentMaxValue;
    private long trxValue;
    public static int numberOfTransactions;

    public static void initTheDay(){
        currentMaxValue = 0;
        currentMinValue = 0;
        numberOfTransactions = 0;
    }

    public BankTransaction(long trxValue) {
        this.trxValue = trxValue;
        if(trxValue <= currentMinValue || currentMinValue == 0){
            currentMinValue = trxValue;
        }
        if(trxValue >= currentMaxValue){
            currentMaxValue = trxValue;
        }
        numberOfTransactions++;
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        if(numberOfTransactions == 1){
            return new BigDecimal(currentMinValue);
        }
        return new BigDecimal(currentMaxValue+currentMinValue);
    }

    public static BigDecimal averageOfTransaction() {
        if(numberOfTransactions == 1){
            return new BigDecimal(currentMinValue);
        }
        return new BigDecimal((currentMinValue+currentMaxValue)/2);
    }
}
