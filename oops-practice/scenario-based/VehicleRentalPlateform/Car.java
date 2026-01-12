class Car extends Vehicle {

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return (days * ratePerDay) + 500; // Service charge
    }

    @Override
    public void display() {
        System.out.println("Car | ID: " + vehicleId +
                ", Brand: " + brand +
                ", Rent/Day: ₹" + ratePerDay +
                ", Available: " + isAvailable);
    }
}
