package controlselection.accents;

import java.util.HashMap;
import java.util.Map;

public class WithoutAccents {

    private final Map<Character,String> charMap = new HashMap<>();

    public char convertToCharWithoutAccents(char character){
        FillCharMap();
        if(charMap.containsKey(character)){
            return charMap.get(character).charAt(0);
        }
        return character;
    }

    private void FillCharMap(){
        charMap.put('á',"a");
        charMap.put('Á',"A");
        charMap.put('é',"e");
        charMap.put('É',"E");
        charMap.put('í',"i");
        charMap.put('Í',"I");
        charMap.put('ó',"o");
        charMap.put('Ó',"O");
        charMap.put('ő',"o");
        charMap.put('Ő',"O");
        charMap.put('ú',"u");
        charMap.put('Ú',"U");
        charMap.put('ű',"u");
        charMap.put('Ű',"U");
    }
}
