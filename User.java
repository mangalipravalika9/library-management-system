import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Book> issuedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public ArrayList<Book> getIssuedBooks() { return issuedBooks; }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return id + " - " + name + " (Issued Books: " + issuedBooks.size() + ")";
    }
}
