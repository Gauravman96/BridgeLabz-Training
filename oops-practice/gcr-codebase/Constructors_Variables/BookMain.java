 class Book {
    String title;
    String author;
    double price;
                      
    // Defaultt constructor
    Book(){
        title="unknown";
        author= "unknown";
        price=0.0;
    }

     // Parameterized constructor

    Book(String title, String author, double price){
        this.title= title;
        this.author= author;
        this.price= price;
    }

     // Method to display book details
     void displayDetails(){
       System.out.println("Title"+ title);
       System.out.println("Author"+author);
       System.out.println("Price"+price);
     }

}
public class BookMain{
  public static void main(String[] args) {
      Book b1= new Book();
      b1.displayDetails();

      // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.99);
        b2.displayDetails();
  }

}
