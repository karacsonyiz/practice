package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CharacterCounter {

    private static Logger logger = LoggerFactory.getLogger(CharacterCounter.class);

    public int countCharacters(String source, String chars) {
        logger.info(("Finding ") + (chars) + (" in ") + (source));
        int place = 0;
        int counter = 0;
        for (char ch : source.toCharArray()) {
            for(char q : chars.toCharArray()) {
                if(ch == q){
                    counter += 1;
                    logger.info("Found char " + ch + (" at place ") + place);
                }
            }
            place += 1;
        }
        return counter;
    }

}
