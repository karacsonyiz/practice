package genericclass;

public class ArraySearch {

    public DataPair<String> getFirstAndLastWord(String[] words){
        checkIfValid(words);
        return new DataPair<>(words[0],words[words.length-1]);
    }



    private void checkIfValid(String[] words){
        if(words == null){
            throw new NullPointerException();
        }
        if(words.length == 0){
            throw new IllegalArgumentException();
        }
    }

}
