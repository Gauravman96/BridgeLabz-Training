import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    // Add books using array
    void addBooks(Book[] bookArray) {
        books.addAll(Arrays.asList(bookArray));
    }

    // Display all books
    void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            System.out.println(b.title + " | " + b.author + " | " +
                    (b.isAvailable ? "Available" : "Checked Out"));
        }
    }

    // Search by partial title
    void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author);
            }
        }
    }

    // Checkout book
    void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isAvailable) {
                    throw new BookNotAvailableException("Book is already checked out");
                }
                b.isAvailable = false;
                System.out.println(title + " has been successfully checked out.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
         Book[] bookArray = {
                new Book("Java Programming", "James Gosling", true),
                new Book("Clean Code", "Robert Martin", true),
                new Book("Data Structures", "Mark Allen", false)
        };

        library.addBooks(bookArray);
        library.displayBooks();

        library.searchBook("java");

        try {
            library.checkoutBook("Data Structures");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.displayBooks();
    }
}
