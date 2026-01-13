 // package HospitalManagementSystem;

public class HospitalSystem {
    public static void main(String[] args) {
         Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor(2, "Dr. Mehta", "Orthopedic");

        Patient p1 = new InPatient(101, "Gaurav", 25, d1, 5, 2000);
        Patient p2 = new OutPatient(102, "Rohit", 30, d2, 800);

        HospitalManagement hospital = new HospitalManagement();

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        System.out.println("\n--- Patient Details ---");
        hospital.displayAllPatients();

        System.out.println("\n--- Bills ---");
        Bill.generateBill((IPayable) p1);
        Bill.generateBill((IPayable) p2);

        System.out.println("\n--- Remove Patient ---");
        hospital.removePatient(101);

        System.out.println("\n--- Final List ---");
        hospital.displayAllPatients();
    }
}
