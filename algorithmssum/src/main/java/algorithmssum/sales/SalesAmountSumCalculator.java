package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson>salespersonList){

        int result = 0;
        for(Salesperson s: salespersonList){
            result += s.getAmount();
        }
        return result;
    }
}
