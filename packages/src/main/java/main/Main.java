package main;

import packages.numbers.NumberConcatenator;
import packages.strings.StringConcatenator;

public class Main {

    public static void main(String[] args) {

        StringConcatenator stringConcatenator = new StringConcatenator();

        System.out.println(stringConcatenator.concatenate("Hello","World"));

        NumberConcatenator numberConcatenator = new NumberConcatenator();

        System.out.println(numberConcatenator.concatenate(3,4));

    }
}
