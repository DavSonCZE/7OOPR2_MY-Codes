package osu.slonka;

import java.util.Calendar;

public class Borrow {
    private User user;
    private Book book;
    private Calendar borrowDate;
    private Calendar expectedReturnDate;
    private Boolean isReturned;

    public Borrow(User user, Book book, Calendar borrowDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = this.expectedReturnDate = borrowDate;
        this.expectedReturnDate.add(Calendar.DATE, 31);
        this.isReturned = false;
    }

    public void prolongBorrow(Calendar date) {
        //
    }

    public void returnBook(){
        isReturned = true;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Calendar getBorrowDate() {
        return borrowDate;
    }

    public Calendar getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public Boolean getReturned() {
        return isReturned;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrowDate(Calendar borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setExpectedReturnDate(Calendar expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public void setReturned(Boolean returned) {
        isReturned = returned;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "user=" + user +
                ", book=" + book +
                ", borrowDate=" + borrowDate +
                ", expectedReturnDate=" + expectedReturnDate +
                ", isReturned=" + isReturned +
                '}';
    }
}
