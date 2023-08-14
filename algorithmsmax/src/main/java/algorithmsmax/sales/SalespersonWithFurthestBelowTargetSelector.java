package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespeople) {

        Salesperson furthestBelow = salespeople.get(0);

        for(Salesperson s : salespeople) {
            if(s.getDifferenceFromTarget() < furthestBelow.getDifferenceFromTarget()){
                furthestBelow = s;
            }
        }
        return furthestBelow;
    }
}
