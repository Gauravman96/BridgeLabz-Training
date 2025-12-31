class Book{
     String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }
    void display() {
        System.out.println(title + " | " + author + " | Available: " + available);
    }
}
      public class LibraryBook {
        public static void main(String[] args) {
        Book b= new Book("java", "Herbert Schildt", 450);
        b.display();
        }    
    }
