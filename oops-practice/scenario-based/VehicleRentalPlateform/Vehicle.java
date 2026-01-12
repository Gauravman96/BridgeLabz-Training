abstract class Vehicle implements IRentable {

    protected int vehicleId;       // protected access
    protected String brand;
    protected double ratePerDay;
    protected boolean isAvailable;

    public Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
        this.isAvailable = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public abstract void display(); // Polymorphism
}
