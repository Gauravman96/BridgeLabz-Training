class Truck extends Vehicle {

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (days * ratePerDay) + 1000; // Heavy load charge
    }

    @Override
    public void display() {
        System.out.println("Truck | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rent/Day: ₹" + ratePerDay +
                ", Available: " + isAvailable);
    }
}
