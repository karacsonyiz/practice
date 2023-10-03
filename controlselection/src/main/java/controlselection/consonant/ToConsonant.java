package controlselection.consonant;

import java.util.*;

public class ToConsonant {

    List<Char> chars = new ArrayList<>();
    List<Character> vowels = new ArrayList<>();

    public Character convertToConsonant(char character){
        fillVowels();
        if(!vowels.contains(character)){
            return character;
        }

        int place = 0;

        Char actualChar = new Char(character);
        Character found = 'a';

        for(Char c : chars){
            if(c.equals(actualChar)){
                place = c.getPlace();
            }
            if(c.isItConsonant() == true && c.getPlace() > place){
                found = c.getCh();
            }
        }

        return found;

    }

    private void fillVowels(){
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
    }

    private void fillChars(){
        chars.add(new Char('a',false,1));
        chars.add(new Char('b',true,2));
        chars.add(new Char('c',true,3));
        chars.add(new Char('d',true,4));
        chars.add(new Char('e',false,5));
        chars.add(new Char('f',true,6));
        chars.add(new Char('g',true,7));
        chars.add(new Char('h',true,8));
        chars.add(new Char('i',false,9));
        chars.add(new Char('j',true,10));
        chars.add(new Char('k',true,11));
        chars.add(new Char('l',true,12));
        chars.add(new Char('m',true,13));
        chars.add(new Char('n',true,14));
        chars.add(new Char('o',false,15));
        chars.add(new Char('p',true,16));
        chars.add(new Char('q',true,17));
        chars.add(new Char('r',true,18));
        chars.add(new Char('s',true,19));
        chars.add(new Char('t',true,20));
        chars.add(new Char('u',false,21));
        chars.add(new Char('v',true,22));
        chars.add(new Char('w',true,23));
        chars.add(new Char('x',true,24));
        chars.add(new Char('y',true,25));
        chars.add(new Char('z',true,26));
    }


}
