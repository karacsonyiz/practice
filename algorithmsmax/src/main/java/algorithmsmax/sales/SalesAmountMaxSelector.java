package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {


        public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople){
            Salesperson max = salespeople.get(0);

            for(Salesperson s : salespeople) {
                if(s.getAmount()> max.getAmount()){
                    max = s;
                }
            }
            return max;
        }


}
