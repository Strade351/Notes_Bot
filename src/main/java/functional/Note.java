package functional;

import java.util.Calendar;

public class Note {
    String title;
    String text;
    String date;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
        date = Integer.toString(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) + "/" +
                Integer.toString(Calendar.getInstance().get(Calendar.MONTH)) + "/" +
                Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
    }

    Note() {

    }

    @Override
    public String toString() {
        String note = this.title + "\n" + this.text + "\n" + this.date;
        return note;
    }
}
