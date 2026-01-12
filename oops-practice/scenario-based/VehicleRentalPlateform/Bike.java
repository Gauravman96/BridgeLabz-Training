class Bike extends Vehicle {

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }

    @Override
    public void display() {
        System.out.println("Bike | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rent/Day: ₹" + ratePerDay +
                ", Available: " + isAvailable);
    }
}
