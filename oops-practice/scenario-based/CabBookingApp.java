import java.util.*;
class User{
    private int userId;
    private String name;

    public User(int userId ,String name){
        this.userId= userId;
        this.name= name;
    }

    public String getName(){
        return name;
    }
}

class Driver{
    private int driverId;
    private String name;
    private boolean available;

    public Driver(int driverId, String name){
        this.driverId= driverId;
        this.name= name;
        this.available= true;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean status){
        this.available= status;
    }

    public String getName(){
        return name;
    }
}

class Ride {
    private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(User user,Driver driver,double distance,double  fare){
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }
     public void displayRide() {
        System.out.println(
            "User: " + user.getName() +
            ", Driver: " + driver.getName() +
            ", Distance: " + distance +
            " km, Fare: ₹" + fare
        );
    }

}

interface FareCalculator{
    double calculateFare(double  distance);
}

//At normal pricing
class NormalFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10; // ₹10 per km
    }
}
// At peak hour pricing
class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15; // ₹15 per km
    }
}

class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

//  Ride Service (CRUD)

class RideService {
    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideHistory = new ArrayList<>();

    public RideService(List<Driver> drivers) {
        this.drivers = drivers;
    }

    // CREATE - Book Ride
    public void bookRide(User user, double distance, FareCalculator calculator)
            throws NoDriverAvailableException {

        Driver assignedDriver = null;

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                assignedDriver = driver;
                break;
            }
        }

        if (assignedDriver == null) {
            throw new NoDriverAvailableException("No driver available at the moment!");
        }

        assignedDriver.setAvailable(false);

        double fare = calculator.calculateFare(distance);
        Ride ride = new Ride(user, assignedDriver, distance, fare);
        rideHistory.add(ride);

        System.out.println("Ride booked successfully!");
        ride.displayRide();
    }

    // READ - Ride History
    public void showRideHistory() {
        System.out.println("\n---- Ride History ----");
        for (Ride ride : rideHistory) {
            ride.displayRide();
        }
    }
}

public class CabBookingApp {
    public static void main(String[] args) {

        User user = new User(1, "Gaurav");

        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(101, "Amit"));
        drivers.add(new Driver(102, "Rahul"));

        RideService rideService = new RideService(drivers);

        FareCalculator normalFare = new NormalFareCalculator();
        FareCalculator peakFare = new PeakFareCalculator();

        try {
            rideService.bookRide(user, 8, normalFare);
            rideService.bookRide(user, 5, peakFare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }

        rideService.showRideHistory();
    }
}

