package packages.numbers;

import packages.strings.StringConcatenator;

public class NumberConcatenator {

    public String concatenate(int a, int b){
        StringConcatenator stringConcatenator = new StringConcatenator();
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        return stringConcatenator.concatenate(aString,bString);
    }
}
