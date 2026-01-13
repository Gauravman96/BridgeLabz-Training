public class Main {
    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf();

        shelf.addBook(new Book("Java Basics", "James"));
        shelf.displayShelf();

        shelf.addBook(new Book("Algorithms", "CLRS"));
        shelf.displayShelf();

        shelf.addBook(new Book("Data Structures", "Mark"));
        shelf.displayShelf();

        shelf.addBook(new Book("Artificial Intelligence", "Russell"));
        shelf.displayShelf();
    }
}
