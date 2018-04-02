package functional;

import java.util.ArrayList;

public class Controller {
    ArrayList<Book> books = new ArrayList<>();
    Book book;

    public Controller() {

    }

    public void printBook(Book book) {
        System.out.println(book.toString());
    }

    public void addBook(String name) {
        books.add(new Book(name));
    }
}
