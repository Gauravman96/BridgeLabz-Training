class Bill {
    public static void generateBill(IPayable patient) {
        System.out.println("Total Bill Amount: " + patient.calculateBill());
    }
}
