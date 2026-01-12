class InvalidInvoiceFormatException extends Exception {
    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}

public class InvoiceGenerator {

    // Parse Invoice String
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-")) {
            throw new InvalidInvoiceFormatException("Invalid format: Missing '-'");
        }

        String[] items = input.split(",");

        for (String item : items) {
            if (!item.contains("-")) {
                throw new InvalidInvoiceFormatException("Invalid item format: " + item);
            }
        }
        return items;
    }

    // Calculate Total Amount
    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.split("-");

            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid task format: " + task);
            }

            String amountPart = parts[1].replaceAll("[^0-9]", "").trim();

            if (amountPart.isEmpty()) {
                throw new InvalidInvoiceFormatException("Amount missing in: " + task);
            }

            total += Integer.parseInt(amountPart);
        }
        return total;
    }

    // Main Method
    public static void main(String[] args) {
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        try {
            String[] tasks = parseInvoice(input);
            int totalAmount = getTotalAmount(tasks);

            System.out.println("Total Invoice Amount: " + totalAmount + " INR");
        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
