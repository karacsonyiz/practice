package controlselection.consonant;

import java.util.Objects;

public class Char {

    private Character ch;
    private boolean isItConsonant;
    private Integer place;

    public Char(Character ch) {
        this.ch = ch;
    }

    public Char(Character ch, boolean isItConsonant, Integer place) {
        this.ch = ch;
        this.isItConsonant = isItConsonant;
        this.place = place;
    }

    public Character getCh() {
        return ch;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public boolean isItConsonant() {
        return isItConsonant;
    }

    public void setItConsonant(boolean itConsonant) {
        isItConsonant = itConsonant;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Char aChar = (Char) o;

        return Objects.equals(ch, aChar.ch);
    }

    @Override
    public int hashCode() {
        return ch != null ? ch.hashCode() : 0;
    }
}
