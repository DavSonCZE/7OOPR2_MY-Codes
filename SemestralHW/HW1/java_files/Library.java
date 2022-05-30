package osu.slonka;

import java.util.List;

public class Library {
    private List<User> users;
    private List<Book> books;
    private List<Borrow> borrows;

    public Library(List<User> users, List<Book> books, List<Borrow> borrows) {
        this.users = users;
        this.books = books;
        this.borrows = borrows;
    }

    public void getBorrowsByUser(User user) {
        //...
        //System.out.println(borrow);
    }

    public void getBorrowsByBook(Book book) {
        //...
        //System.out.println(borrow);
    }

    public void getPenaltiesByUser(User user) {
        //...
        //System.out.println(penalty);
    }

    public void getActiveBorrows() {
        //...
        //System.out.println(borrow);
    }

    public void getLateBorrows() {
        //...
        //System.out.println(borrow);
    }

    public void newBorrow() {
        //
    }

    public void newBook() {
        //
    }

    public void newUser() {
        //
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }

    @Override
    public String toString() {
        return "Library{" +
                "users=" + users +
                ", books=" + books +
                ", borrows=" + borrows +
                '}';
    }
}
