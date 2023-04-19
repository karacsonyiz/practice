package algorithmscount.letters;

public class LetterCounter {

    public int countLetters(String word,char letter){
        int counter = 0;
        for(int i = 0;i< word.length();i++){
            if(word.charAt(i) == letter){
                counter+= 1;
            }
        }
        return counter;
    }
}
