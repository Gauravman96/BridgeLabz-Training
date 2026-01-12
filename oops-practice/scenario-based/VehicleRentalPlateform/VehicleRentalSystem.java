import java.util.*;

class VehicleRentalSystem {

    private List<Vehicle> vehicles = new ArrayList<>();

    // CREATE
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    // READ
    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            v.display(); // Polymorphism
        }
    }

    // UPDATE (Rent Vehicle)
    public void rentVehicle(int vehicleId, int days) {
        for (Vehicle v : vehicles) {
            if (v.vehicleId == vehicleId && v.isAvailable) {
                double rent = v.calculateRent(days);
                v.setAvailability(false);
                System.out.println("Vehicle rented. Total Rent: ₹" + rent);
                return;
            }
        }
        System.out.println("Vehicle not available or not found.");
    }

    // DELETE
    public void removeVehicle(int vehicleId) {
        vehicles.removeIf(v -> v.vehicleId == vehicleId);
        System.out.println("Vehicle removed successfully.");
    }
}
