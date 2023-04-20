package algorithmsdecision.integers;

import java.util.List;

public class IntegerDecisionMaker {

    public boolean containsGreaterThan(List<Integer> numbers, int max){
        for(int i : numbers){
            if(i > max){
                return true;
            }
        }
        return false;
    }

    public boolean containsLowerThan(List<Integer> numbers, int min){
        for(int i : numbers){
            if(i < min){
                return true;
            }
        }
        return false;
    }
}
