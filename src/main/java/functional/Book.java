package functional;

import java.util.ArrayList;

public class Book {
    int id;
    String name;
    ArrayList<Note> notes = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public void addNote(String name, String text) {
        notes.add(new Note(name, text));
    }

    public void deleteNote(Note note) {
        notes.remove(note);
    }

    /**
     * Возвращает количество заметок в книге
     * @return
     */
    public int getSize() {
        return notes.size();
    }

    @Override
    public String toString() {
        return notes.toString();
    }
}