class Order {
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

//subclass

class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); 
        this.trackingNumber = trackingNumber;
    }

    // Overriding method
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

// subclass 

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

// Main method
public class OnlineRetailOrderManage {
     public static void main(String[] args) {

        Order order = new Order(101, "01-Jan-2026");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder =
                new ShippedOrder(102, "02-Jan-2026", "TRK12345");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder =
                new DeliveredOrder(103, "03-Jan-2026", "TRK67890", "05-Jan-2026");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
