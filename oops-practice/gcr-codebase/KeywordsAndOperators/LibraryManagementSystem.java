class Book{
      //static variable
      static String libraryName="Egmore Library";

      //instance Variable
      String title;
      String author;
      final String isbn;

      // Constructor using 'this'
      Book(String title,String author,String isbn){
         this.title= title;
         this.author=author;
         this.isbn= isbn;
      }

      //Static method
      static void displayLibraryName(){
         System.out.println("Library Name" + libraryName);
      }

      // Method to display book details using instanceof
      void displayDetails(Object obj){
        //instanceof check

        if(obj instanceof Book){
            Book b = (Book) obj;
            System.out.println("title"+ b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Invalid object");
        }
      }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("Effective Java","Joshua Bloch",
                "978-0134685991");
                Book.displayLibraryName(); // static method call direct
                book.displayDetails(book);

    }
}
