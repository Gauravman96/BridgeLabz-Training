class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this(hb.guestName, hb.roomType, hb.nights);
    }

    void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }
}
public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking Hb = new HotelBooking("Rohit","AC",5);
        Hb.display();
    }
}
