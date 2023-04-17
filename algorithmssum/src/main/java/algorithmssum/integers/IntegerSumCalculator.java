package algorithmssum.integers;

import java.util.List;

public class IntegerSumCalculator {

    public int sum(List<Integer> numbers){
        int result = 0;
        for(int i : numbers){
            result += i;
        }
        return result;
    }
}
