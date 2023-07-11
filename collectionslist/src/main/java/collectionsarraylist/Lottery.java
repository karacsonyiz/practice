package collectionsarraylist;

import java.util.*;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if(ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more than the winning numbers!");
        }
        Set<Integer> result = new HashSet<>();
        do {
            result.add(generateNum(ballCount));
        } while(result.size() < lotteryType);
        return new ArrayList<>(result);
    }

    private int generateNum(int ballCount){
        Random random = new Random();
        return random.nextInt(ballCount);
    }
}
