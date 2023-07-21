package sorting;

import java.util.Arrays;

public class OrderedArrayLibrary {

    private final Book[] bookList;

    public OrderedArrayLibrary(Book[] bookList) {
        this.bookList = bookList;
    }

    public Book[] sortingById() {
        Book[] sortedBooks = bookList;
        Arrays.sort(sortedBooks);
        return sortedBooks;
    }

    public Book[] sortingByTitle() {
        Book[] sortedBooks = bookList;
        Arrays.sort(sortedBooks, new TitleComparator());
        return sortedBooks;
    }
}
