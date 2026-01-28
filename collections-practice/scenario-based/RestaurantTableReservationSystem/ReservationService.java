import java.util.*;

public class ReservationService {

    private Map<Integer, Table> tableMap = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    // Add tables
    public void addTable(Table table) {
        tableMap.put(table.getTableNumber(), table);
    }

    // Reserve table
    public void reserveTable(int tableNumber, String customerName, String timeSlot)
            throws TableAlreadyReservedException {

        if (!tableMap.containsKey(tableNumber)) {
            System.out.println("Table does not exist");
            return;
        }

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equalsIgnoreCase(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, customerName, timeSlot));
        System.out.println("Reservation successful!");
    }

    // Cancel reservation
    public void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
                r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equalsIgnoreCase(timeSlot));

        System.out.println("Reservation cancelled (if existed)");
    }

    // Show available tables for a time slot
    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (Table table : tableMap.values()) {
            boolean booked = false;

            for (Reservation r : reservations) {
                if (r.getTableNumber() == table.getTableNumber() &&
                    r.getTimeSlot().equalsIgnoreCase(timeSlot)) {
                    booked = true;
                    break;
                }
            }

            if (!booked) {
                System.out.println(table);
            }
        }
    }
}
