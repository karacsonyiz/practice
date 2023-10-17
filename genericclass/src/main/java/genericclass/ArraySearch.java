package genericclass;

public class ArraySearch {

    public DataPair<String> getFirstAndLastWord(String[] words){
        checkIfValid(words);
        return null;
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
