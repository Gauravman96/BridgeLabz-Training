class InPatient extends Patient implements IPayable{
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, Doctor doctor,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill(){
        return daysAdmitted *dailyCharge;
    }

     @Override
    public void displayInfo() {
        System.out.println("In-Patient | ID: " + getPatientId() +
                ", Name: " + getName() +
                ", Doctor: " + getDoctor().getName() +
                ", Bill: ₹" + calculateBill());
    }
}
