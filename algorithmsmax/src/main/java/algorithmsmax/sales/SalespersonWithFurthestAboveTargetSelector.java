package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespeople) {

        Salesperson furthestAbove = salespeople.get(0);

        for(Salesperson s : salespeople) {
            if(s.getDifferenceFromTarget() > furthestAbove.getDifferenceFromTarget()){
                furthestAbove = s;
            }
        }

        return furthestAbove;
    }
}
