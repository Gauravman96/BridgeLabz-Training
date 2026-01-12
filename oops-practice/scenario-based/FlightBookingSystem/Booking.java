class Booking {
    int bookingId;
    Flight flight;
    String passengerName;

    public Booking(int bookingId, Flight flight, String passengerName) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        flight.displayFlight();
        System.out.println("---------------------------");
    }
}
