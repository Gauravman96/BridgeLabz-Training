public class VehicleRentalApp {
    public static void main(String[] args) {

        VehicleRentalSystem system = new VehicleRentalSystem();

        system.addVehicle(new Bike(1, "Honda", 300));
        system.addVehicle(new Car(2, "Hyundai", 1200));
        system.addVehicle(new Truck(3, "Tata", 2500));

        System.out.println("\n--- Available Vehicles ---");
        system.displayVehicles();

        System.out.println("\n--- Rent Vehicle ---");
        system.rentVehicle(2, 3);

        System.out.println("\n--- After Renting ---");
        system.displayVehicles();

        System.out.println("\n--- Remove Vehicle ---");
        system.removeVehicle(1);

        System.out.println("\n--- Final List ---");
        system.displayVehicles();
    }
}
