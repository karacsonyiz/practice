package collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) throws IllegalArgumentException {
        if(drawCount >= maxNumber) {
            throw new IllegalArgumentException("drawCount must be less");
        }
        List<Integer> result = new LinkedList<>();
        for(int i = 0;i < drawCount; i++) {
            result.add(generateNum(maxNumber));
        }
        return new HashSet<>(result);
    }

    private int generateNum(int maxNumber){
        Random random = new Random();
        return random.nextInt(maxNumber);
    }


}
