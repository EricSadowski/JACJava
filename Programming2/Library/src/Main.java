

// Main class
public class Main {
    public static void main(String[] args) {
        // create new library
        Library myLibrary = new Library();

        // add books to the library
        myLibrary.addBook(new Book("Moby Dick", "Herman Melville"));
        myLibrary.addBook(new Book("1984", "George Orwell"));

        // print all books in library
        myLibrary.printBooks();
    }
}