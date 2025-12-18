public class DiscountCalc {
    public static void main(String[] args) {
         int fee = 125000;
        int discountPercent = 10;

        // Calculate discount
        int discount = (fee * discountPercent) / 100;

        // Calculate final fee
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
    
}
