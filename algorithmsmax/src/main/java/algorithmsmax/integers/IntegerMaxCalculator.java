package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> integerList){

        int max = integerList.get(0);
        for(int i : integerList){
            if(max<i){
                max = i;
            }
        }
        return max;
    }
}
