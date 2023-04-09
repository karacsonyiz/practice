package arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Capsules capsules = new Capsules(new ArrayList<>());
        Books books = new Books(new ArrayList<>());

        books.add("Lord Of The Rings : Fellowship Of The Ring");
        books.add("Lord Of The Rings : Two Towers");
        books.add("Harry Potter");
        books.add("A csinovnyik halála");

        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("Lor"));

        capsules.addLast("Malac");
        capsules.addLast("Kalacs");
        capsules.addLast("Kolbasz");
        capsules.addFirst("Sajt");
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());

    }
}
