package methodoverloading.pub;

import java.util.List;

public class ListOfGoodPubs {

    private List<Pub> goodPubs;

    public ListOfGoodPubs(List<Pub> goodPubs) {
        if(goodPubs.size() == 0) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.goodPubs = goodPubs;
    }
    public Pub findTheBest() {
        Pub bestPub = goodPubs.get(0);
        for(Pub pub : goodPubs){
            if(pub.getOpenFrom().isEarlier(bestPub.getOpenFrom().getHours(),bestPub.getOpenFrom().getMinutes(),bestPub.getOpenFrom().getSeconds())){
                bestPub = pub;
            }
        }
        return bestPub;
    }


}
