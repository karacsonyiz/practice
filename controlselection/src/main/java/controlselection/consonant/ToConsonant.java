package controlselection.consonant;

import java.util.*;

public class ToConsonant {

    List<Character> vowels = new ArrayList<>();
    String characters = "abcdefghijklmnopqrstuvwxyz";

    public Character convertToConsonant(char character){
        fillVowels();
        if(!vowels.contains(character)){return character;}
        List<String> characterList = Arrays.asList(characters.split(""));

        int place = 0;
        for(String s : characterList){
            if(s.equals(Character.toString(character))){
                break;
            }
            place += 1;
        }

        return characterList.get(place+1).charAt(0);
    }

    private void fillVowels(){
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
    }




}
