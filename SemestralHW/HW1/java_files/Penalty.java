package osu.slonka;

public class Penalty {
    Book book;
    private int daysOverdue;

    public Penalty(Book book, int daysOverdue) {
        this.book = book;
        this.daysOverdue = daysOverdue;
    }

    public Book getBook() {
        return book;
    }

    public int getDaysOverdue() {
        return daysOverdue;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDaysOverdue(int daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "book=" + book +
                ", daysOverdue=" + daysOverdue +
                '}';
    }
}
