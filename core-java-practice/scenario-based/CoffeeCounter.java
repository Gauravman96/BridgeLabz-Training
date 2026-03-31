import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gstRate = 0.05; 

        while (true) {

            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit':");
            String coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed. Thank you!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double pricePerCup = 0;

            
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * gstRate;
            double finalBill = totalPrice + gstAmount;

            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("GST (5%): ₹" + gstAmount);
            System.out.println("Final Bill: ₹" + finalBill);
        }

    }
}
