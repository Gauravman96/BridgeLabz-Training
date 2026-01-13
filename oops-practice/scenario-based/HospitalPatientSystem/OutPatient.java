class OutPatient extends Patient implements IPayable{

    private double consultationFee;

    public OutPatient(int id, String name, int age, Doctor doctor, double fee) {
        super(id, name, age, doctor);
        this.consultationFee = fee;
    }

     @Override
    public double calculateBill() {
        return consultationFee;
    }

     @Override
    public void displayInfo() {
        System.out.println("Out-Patient | ID: " + getPatientId() +
                ", Name: " + getName() +
                ", Doctor: " + getDoctor().getName() +
                ", Bill: ₹" + calculateBill());
    }

}
