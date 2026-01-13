public class TrafficManager {
    public static void main(String[] args) {

        Roundabout rb = new Roundabout(3, 5);

        rb.addVehicle("CAR-101");
        rb.addVehicle("CAR-102");
        rb.addVehicle("CAR-103");
        rb.addVehicle("CAR-104"); // goes to queue
        rb.addVehicle("CAR-105"); // goes to queue

        rb.printRoundabout();

        rb.removeVehicle("CAR-102");
        rb.printRoundabout();

        rb.removeVehicle("CAR-101");
        rb.printRoundabout();

        rb.removeVehicle("CAR-999"); // not found
    }
}
