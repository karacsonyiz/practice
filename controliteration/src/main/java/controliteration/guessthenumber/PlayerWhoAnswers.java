package controliteration.guessthenumber;

import java.util.Random;

public class PlayerWhoAnswers {

    private Random random;
    private int guess;

    public PlayerWhoAnswers(Random random,int guess) {
        this.random = random;
        this.guess = guess;
    }

    public Answer answerTo(int guess){
        return null;
    }
}
