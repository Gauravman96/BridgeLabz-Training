import java.util.*;
public class SmartCheckout {

    public static void main(String[] args) {

        // Queue for customers
        Queue<Customer> queue = new LinkedList<>();

        // Price Map
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Rice", 60);
        priceMap.put("Eggs", 10);

        // Stock Map
        HashMap<String, Integer> stockMap = new HashMap<>();
        stockMap.put("Milk", 10);
        stockMap.put("Bread", 10);
        stockMap.put("Rice", 10);
        stockMap.put("Eggs", 50);
        // Add customers
        queue.add(new Customer("Aman", Arrays.asList("Milk", "Bread")));
        queue.add(new Customer("Neha", Arrays.asList("Rice", "Eggs", "Eggs")));
        queue.add(new Customer("Rohit", Arrays.asList("Milk", "Rice")));

        // Process Queue
        while (!queue.isEmpty()) {
            Customer c = queue.poll(); // remove customer
            System.out.println("\nProcessing Customer: " + c.name);

            int totalBill = 0;

            for (String item : c.items) {
                int price = priceMap.get(item);
                int stock = stockMap.get(item);

                if (stock > 0) {
                    totalBill += price;
                    stockMap.put(item, stock - 1); // update stock
                    System.out.println(item + " bought for ₹" + price);
                } else {
                    System.out.println(item + " is OUT OF STOCK");
                }
            }
             System.out.println("Total Bill for " + c.name + ": ₹" + totalBill);
        }

        System.out.println("\nRemaining Stock: " + stockMap);
    }
}
