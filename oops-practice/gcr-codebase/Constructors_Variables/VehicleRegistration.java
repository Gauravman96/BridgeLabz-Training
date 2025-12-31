class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable 
    static double registrationFee = 2500.0;

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle("Gaurav", "Car");
        Vehicle v2= new Vehicle("Rahul", "Bike");
        v1.displayVehicleDetails();
        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(3000.0);
        System.out.println();

        v2.displayVehicleDetails();
    }
    
}
