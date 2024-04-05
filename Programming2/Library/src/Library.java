import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // constructor
    public Library() {
        this.books = new ArrayList<Book>();
    }

    // method to add a book to the library
    public void addBook(Book book) {
        this.books.add(book);
    }

    // method to print all books in the library
    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book.getTitle() + ", by " + book.getAuthor());
        }
    }

    
}
