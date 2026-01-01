class Product{

     static double discount = 10.0; // percentage

    // Instance variables
    String productName;
    double price;
    int quantity;
    final String productID;   

     Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Calculate price after discount
    double calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }

      // Method using instanceof
    void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;

            System.out.println("Product ID: " + p.productID);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Price: $" + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" +
                    p.calculateDiscountedPrice());
            System.out.println();
        }
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1= new Product("P001","Laptop", 1200.0, 22);
         Product p2 = new Product("P002", "Smartphone", 800.0, 10);

    
        p1.displayProductDetails(p1);
        p2.displayProductDetails(p2);
    
    }
}
