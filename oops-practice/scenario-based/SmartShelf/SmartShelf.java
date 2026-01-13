import java.util.*;

class SmartShelf {

    List<Book> books = new ArrayList<>();

    //  Add book in real-time
    public void addBook(Book newBook) {

        int i = books.size() - 1;
        books.add(newBook); // temporary add at end

        // Shift books that alphabetically greater
        while (i >= 0 &&
                books.get(i).title.compareToIgnoreCase(newBook.title) > 0) {

            books.set(i + 1, books.get(i));
            i--;
        }

        // Insert at correct position
        books.set(i + 1, newBook);
    }

    // Display shelf
    public void displayShelf() {
        System.out.println("Smart Shelf:");
        for (Book b : books) {
            System.out.println(b.title + " - " + b.author);
        }
        System.out.println();
    }
}
