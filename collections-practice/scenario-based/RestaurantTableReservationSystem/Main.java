public class Main {
    public static void main(String[] args) {

        ReservationService service = new ReservationService();

        service.addTable(new Table(1, 4));
        service.addTable(new Table(2, 2));
        service.addTable(new Table(3, 6));

        try {
            service.reserveTable(1, "Gaurav", "7PM-8PM");
            service.reserveTable(2, "Amit", "7PM-8PM");

            // Double booking attempt
            service.reserveTable(1, "Rahul", "7PM-8PM");

        } catch (TableAlreadyReservedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.showAvailableTables("7PM-8PM");

        service.cancelReservation(1, "7PM-8PM");

        service.showAvailableTables("7PM-8PM");
    }
}
