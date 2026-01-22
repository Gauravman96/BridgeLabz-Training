public class ShoppingCartTest {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Add product prices
        cart.addProductPrice("Laptop", 60000);
        cart.addProductPrice("Phone", 30000);
        cart.addProductPrice("Headphones", 2000);
        cart.addProductPrice("Keyboard", 1500);

        // Add to cart
        cart.addToCart("Laptop");
        cart.addToCart("Phone");
        cart.addToCart("Keyboard");
        cart.addToCart("Headphones");

        System.out.println();
        cart.displayCart();

        System.out.println();
        cart.displaySortedByPrice();
    }
}
