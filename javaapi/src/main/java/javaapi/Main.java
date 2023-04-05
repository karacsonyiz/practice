package javaapi;

public class Main {

    public static void main(String[] args) {
        URLParser urlParser = new URLParser();
        System.out.println(urlParser.readHost("https://google.com"));
        System.out.println(urlParser.readHost("abcd^"));
    }
}
