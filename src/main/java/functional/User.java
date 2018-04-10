package functional;

import java.util.ArrayList;

public class User {
    int id;
    String name;
    ArrayList<Book> books = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
