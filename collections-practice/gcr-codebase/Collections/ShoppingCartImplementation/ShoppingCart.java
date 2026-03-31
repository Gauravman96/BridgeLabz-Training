import java.util.*;

class ShoppingCart {

    private Map<String, Integer> priceMap = new HashMap<>();

    // Maintain insertion order
    private Map<String, Integer> cart = new LinkedHashMap<>();

    // Add product price
    void addProductPrice(String product, int price) {
        priceMap.put(product, price);
    }

    // Add item to cart
    void addToCart(String product) {
        if (priceMap.containsKey(product)) {
            cart.put(product, priceMap.get(product));
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    // Display cart (insertion order)
    void displayCart() {
        System.out.println("Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
    }

    // Display items sorted by price
    void displaySortedByPrice() {

        TreeMap<Integer, List<String>> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("Cart (Sorted by Price):");
        for (Map.Entry<Integer, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
        }
    }
}
